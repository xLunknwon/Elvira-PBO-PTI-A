package TugasPraktikum;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return "Nama Kue : " + getNama() + "\n    Harga    : " + getHarga();
    }

}
