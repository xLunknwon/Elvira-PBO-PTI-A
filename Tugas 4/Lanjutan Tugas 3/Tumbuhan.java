class Tumbuhan {
    private String nama;
    private String jenis;
    private double tinggi;

    public Tumbuhan(String nama, String jenis, double tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void fotosintesis() {
        System.out.println(nama + " sedang melakukan fotosintesis");
    }
}
