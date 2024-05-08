package AnalisisPercobaan;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;// penjualan per minggu
    private double commissionRate;// komisi

    public CommissionEmployee(String name, String noKTP, double sales, double rate, LocalDate tglLahir) {
        super(name, noKTP, tglLahir);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        if (getTglLahir().getMonth() == getTglSekarang().getMonth()) {
            return (getCommissionRate() * getGrossSales()) + 100000;
        } else {
            return getCommissionRate() * getGrossSales();
        }
    }

    public String toString() {
        return String.format("Commision employee: " + super.toString() + "\ngross sales: " + getGrossSales()
                + "\ncommission rate" + getCommissionRate());
    }
}
