public class Manusia {
    private String nama;
    private int umur;
    private String pekerjaan;

    public Manusia(String nama, int umur, String pekerjaan) {
        this.nama = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public void bekerja() {
        System.out.println(nama + " sedang bekerja sebagai " + pekerjaan);
    }
}