package AnalisisPercobaan;

import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private int jumlahProduksi; // jumlah barang yang diproduksi
    private double upahPerBarang; // upah per barang

    public ProductionEmployee(String name, String noKTP, int jumlahProduksi, double upahPerBarang, LocalDate tglLahir) {
        super(name, noKTP, tglLahir);
        setJumlahProduksi(jumlahProduksi);
        setUpahPerBarang(upahPerBarang);
    }

    public void setJumlahProduksi(int jumlahProduksi) {
        this.jumlahProduksi = jumlahProduksi;
    }

    public int getJumlahProduksi() {
        return jumlahProduksi;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public double earnings() {
        double totalEarnings = jumlahProduksi * upahPerBarang;
        if (getTglLahir().getMonth() == LocalDate.now().getMonth()) {
            // Bonus birthday
            totalEarnings += 100000;
        }
        return totalEarnings;
    }

    public String toString() {
        return String.format("Production employee: " + super.toString() +
                "\njumlah produksi: " + getJumlahProduksi() +
                "\nupah per barang: " + getUpahPerBarang());
    }
}
