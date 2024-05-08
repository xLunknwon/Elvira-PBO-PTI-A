package TugasPraktikum;

class KueBasi extends Kue {
    private double lamaHari;

    public KueBasi(String nama, double harga, double lamaHari) {
        super(nama, harga);
        this.lamaHari = lamaHari;
    }

    public double getLamaHari() {
        return lamaHari;
    }

    public void setLamaHari(double lamaHari) {
        this.lamaHari = lamaHari;
    }

    public double hitungHarga() {
        return getHarga() - (lamaHari * (getHarga() * 0.1));
    }
}