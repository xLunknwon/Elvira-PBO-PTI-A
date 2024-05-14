package TugasPraktikum;

public abstract class Pegawai {
    private String nama;
    private String noKTP;

    public Pegawai(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    @Override
    public String toString() {
        return "Nama\t\t: " + getNama() + "\nNo.KTP\t\t: " + getNoKTP();
    }

    // Abstract method untuk menghitung salary
    public abstract double gaji();
}
