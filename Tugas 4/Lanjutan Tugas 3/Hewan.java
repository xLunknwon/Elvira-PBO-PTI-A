public class Hewan {
    private String nama;
    private int umur;
    private String makanan;
    private String jenis;

    // Constructors
    // Constructor overload 1
    public Hewan(String nama, String jenis, int umur, String makanan) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.makanan = makanan;
    }

    // Constructor overload 2
    public Hewan(String nama, String jenis, int umur) {
        this(nama, jenis, umur, "belum ditentukan"); // Memanggil constructor overload 1
    }

    // Constructor overload 3
    public Hewan(String nama, String jenis) {
        this(nama, jenis, 0); // Memanggil constructor overload 2
    }

    // Getter and setter methods
    public String getNama() {
        return nama;
    }

    public String getJenis() {
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

    // Method overloading
    public void makan() {
        System.out.println(nama + " sedang makan " + makanan);
    }

    public void makan(String makanan) {
        System.out.println(nama + " suka makan " + makanan);
    }

    public void makan(int porsi) {
        System.out.println(nama + " sedang makan " + porsi + " porsi " + makanan);
    }

    //intanse unruk mengenmbalikan nilai dari kelas itu sendiri
    public Hewan getInstance() {
        return this;
    }
}
