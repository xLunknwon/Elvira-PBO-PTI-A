package TugasPraktikum;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getnama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public boolean getMenikah() {
        return true;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25.0; //M
            } else {
                return 20.0; //F
            }
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String toString() {
        return "Nama         : " + getnama() + "\nNIK          : " + getNik() + 
                "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
                "\nPendapatan   : " + getPendapatan();
    }
}
