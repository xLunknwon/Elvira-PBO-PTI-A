// 5. Setelah program diubah seperti perintah pada soal, tidak terjadi error
        // pada program karena method yang ada pada class Hewan tidak menggunakan
        // override sehingga ketika implementasi interface Identitas dihapus, maka hanya
        // menjadi method biasa
public class Hewan implements MakhlukHidup{ //Identitas { 
    private String nama; 
    private int umur;

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
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

    @Override 
    public void makan() { 
        System.out.println("Makan pakai tangan dan mulut"); 
    } 
 
    @Override 
    public void berjalan() { 
        System.out.println("Jalan pakai 4 kaki"); 
    } 
 
    @Override 
    public void bersuara() { 
        System.out.println("Suaranya nggak jelas"); 
    } 
     
    public void tampilkanNama (){} 
     
    public void tampilkanUmur () {} 
}