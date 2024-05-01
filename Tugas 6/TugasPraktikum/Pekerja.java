package src.TugasPraktikum;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        double bonus = 0;
        int lamaKerja = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lamaKerja >= 0 && lamaKerja < 5) {
            bonus += 0.05 * getGaji(); // Bonus 5% dari gaji jika bekerja 0 - 5 tahun
        } else if (lamaKerja >= 5 && lamaKerja < 10) {
            bonus += 0.10 * getGaji(); // Bonus 10% dari gaji jika bekerja 5 - 10 tahun
        } else if (lamaKerja >= 10) {
            bonus += 0.15 * getGaji(); // Bonus 15% dari gaji jika bekerja lebih dari 10 tahun
        }
        return bonus;
    }

    public double getGaji() {
        return gaji;
    }

    public double getTunjangan(){
        return super.getTunjangan() + (jumlahAnak * 20);
    }

    public double getPendapatan(){
        return getGaji() + getBonus() + getTunjangan();
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public String toString() {
        return super.toString() + "\nTahun Masuk  : " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue()
                + " " + tahunMasuk.getYear()
                + "\nJumlah Anak  : " + jumlahAnak + 
                "\nGaji         : $" + gaji;
    }
}
