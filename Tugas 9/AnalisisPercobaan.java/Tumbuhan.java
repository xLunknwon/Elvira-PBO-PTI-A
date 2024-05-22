 
public class Tumbuhan implements MakhlukHidup, TumbuhanInterface {

    private String nama;
    private int umur;

    // Konstruktor
    public Tumbuhan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public void makan() {
        System.out.println("Tumbuhan menyerap nutrisi melalui akar.");
    }

    @Override
    public void berjalan() {
        System.out.println("Tumbuhan tidak dapat berjalan.");
    }

    @Override
    public void bersuara() {
        System.out.println("Tumbuhan tidak bersuara.");
    }

    @Override
    public void fotosintesis() {
        System.out.println("Tumbuhan melakukan fotosintesis untuk membuat makanan.");
    }

    public void tampilkanNama() {
        System.out.println("Nama tumbuhan: " + this.nama);
    }

    public void tampilkanUmur() {
        System.out.println("Umur tumbuhan: " + this.umur);
    }
}
