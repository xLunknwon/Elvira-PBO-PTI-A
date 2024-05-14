package TugasPraktikum;

public class Main {

    public static void main(String[] args) {

        // Membuat objek dari kelas PegawaiTetap
        PegawaiTetap t1 = new PegawaiTetap("Elvira", "2109876543234567890101", 5000000);
        PegawaiTetap t2 = new PegawaiTetap("Rosa", "2109876543234567890102", 6000000);
        PegawaiTetap t3 = new PegawaiTetap("Khoir", "2109876543234567890103", 4000000);

        // Menampilkan informasi PegawaiTetap
        System.out.println("\n== Pegawai tetap");
        System.out.println(t1.toString());
        System.out.println();
        System.out.println(t2.toString());
        System.out.println();
        System.out.println(t3.toString());

        // Membuat objek dari kelas PegawaiHarian
        PegawaiHarian h1 = new PegawaiHarian("Yono", "2109876543234567890110", 5000, 50);
        PegawaiHarian h2 = new PegawaiHarian("Budi", "2109876543234567890111", 6000, 30);
        PegawaiHarian h3 = new PegawaiHarian("Adel", "2109876543234567890112", 7000, 20);

        // Menampilkan informasi PegawaiHarian
        System.out.println("\n== Pegawai harian");
        System.out.println(h1.toString());
        System.out.println();
        System.out.println(h2.toString());
        System.out.println();
        System.out.println(h3.toString());

        // Membuat objek dari kelas Sales
        Sales s1 = new Sales("Tono", "2109876543234567890120", 30, 50000);
        Sales s2 = new Sales("Nini", "2109876543234567890121", 45, 60000);
        Sales s3 = new Sales("Anu", "2109876543234567890122", 50, 70000);

        // Menampilkan informasi Sales
        System.out.println("\n== Sales");
        System.out.println(s1.toString());
        System.out.println();
        System.out.println(s2.toString());
        System.out.println();
        System.out.println(s3.toString());

        // Upcasting PegawaiTetap ke Pegawai
        System.out.println("\n== Upcasting");
        Pegawai p1 = t1;
        System.out.println(p1.toString());

        // Downcasting Pegawai ke PegawaiTetap
        System.out.println("\n== Downcasting");
        PegawaiTetap t5 = (PegawaiTetap) p1;
        System.out.println(t5.toString());
    }
}