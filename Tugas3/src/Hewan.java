public class Hewan {
    private String nama;
    private int umur;
    private String makanan;
    private String jenis;

    public Hewan(String nama, String jenis, int umur, String makanan) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.makanan = makanan;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis(){
        return jenis;
    }

    public int getUmur() {
        return umur;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public void makan() {
        System.out.println(nama + " sedang makan " + makanan);
    }
}