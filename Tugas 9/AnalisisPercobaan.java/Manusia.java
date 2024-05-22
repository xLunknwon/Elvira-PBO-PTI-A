public class Manusia implements MakhlukHidup, Identitas { 
 
    private String nama; 
    private int umur; 
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // 6. membuat konstruktor 
    // Konstruktor untuk inisialisasi nama dan umur
    public Manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    @Override 
    public void makan() { 
        System.out.println("Makan pakai sendok garpu");} 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai dua kaki");} 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya merdu");} 

    
    @Override 
    public void tampilkanNama() { 
        System.out.println("Nama saya: " + this.nama);} 
 
    @Override 
    public void tampilkanUmur() { 
        System.out.println("Umur saya: " + this.umur);} 
     
} 