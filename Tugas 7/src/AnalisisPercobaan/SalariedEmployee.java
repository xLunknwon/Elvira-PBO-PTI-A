package AnalisisPercobaan;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, double salary, LocalDate tglLahir) {
        super(name, noKTP, tglLahir);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        weeklySalary = salary;
        if (getTglLahir().getMonth() == getTglSekarang().getMonth()) {
            weeklySalary += 100000;
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried employee: " +
                super.toString() +
                "\nweekly salary:" + getWeeklySalary());
    }
}
