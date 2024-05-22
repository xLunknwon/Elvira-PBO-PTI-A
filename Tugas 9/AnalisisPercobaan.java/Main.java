import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // no.1 Tidak ada error namun, terdapat kesalahan karena tidak ada konstruktor
        // dan method setter dan getter pada class manusia dan hewan

        // no.2 Tidak, interface tidak bisa diinstansiasi menjadi sebuah objek.
        // Interface hanya mendefinisikan metode tanpa memberikan implementasi.
        // Oleh karena itu, kita tidak dapat membuat instance langsung dari sebuah
        // interface. Untuk menggunakan metode yang didefinisikan dalam interface,
        // harus membuat kelas konkret yang mengimplementasikan interface tersebut dan
        // kemudian membuat instance dari kelas konkret tersebut.

        // no.3 Ya, suatu kelas dapat mengimplementasikan lebih dari satu interface.
        // Java mendukung multiple inheritance melalui interface, yang berarti 
        // sebuah kelas dapat mengimplementasikan beberapa interface. 

       
        // 7. Untuk menjawab soal nomor 7, saya memodifikasi class Main dengan
        // menambahkan input kemudian menampilkan pesan untuk memasukkan data yang
        // diperlukan. Kemudian, data untuk class Manusia saya masukkan ke dalam
        // constructor dan data untuk class Hewan saya masukkan ke dalam setter atribut
        // nama dan umur milik class Hewan.
       Scanner input = new Scanner(System.in);
       // Menginstansiasi objek Manusia dengan input dari pengguna
       System.out.println("=== Input Data Manusia ===");
       System.out.print("Masukkan namamu: ");
       String namaManusia = input.nextLine();
       System.out.print("Masukkan umurmu: ");
       int umurManusia = input.nextInt();
       input.nextLine(); // Membersihkan buffer
       Manusia manusia = new Manusia(namaManusia, umurManusia);

       System.out.println("\n=== Data Manusia ===");
       manusia.tampilkanNama();
       manusia.tampilkanUmur();
       manusia.makan();
       manusia.berjalan();
       manusia.bersuara();

       // Menginstansiasi objek Hewan dengan input dari pengguna
       System.out.println("\n=== Input Data Hewan ===");
       System.out.print("Masukkan nama hewan: ");
       String namaHewan = input.nextLine();
       System.out.print("Masukkan umur hewan: ");
       int umurHewan = input.nextInt();
       input.nextLine(); // Membersihkan buffer
       Hewan hewan = new Hewan(namaHewan, umurHewan);

       System.out.println("\n=== Data Hewan ===");
       hewan.tampilkanNama();
       hewan.tampilkanUmur();
       hewan.makan();
       hewan.berjalan();
       hewan.bersuara();

       // Menginstansiasi objek Tumbuhan dengan input dari pengguna
       System.out.println("\n=== Input Data Tumbuhan ===");
       System.out.print("Masukkan nama tumbuhan: ");
       String namaTumbuhan = input.nextLine();
       System.out.print("Masukkan umur tumbuhan: ");
       int umurTumbuhan = input.nextInt();
       input.nextLine(); // Membersihkan buffer
       Tumbuhan tumbuhan = new Tumbuhan(namaTumbuhan, umurTumbuhan);

       System.out.println("\n=== Data Tumbuhan ===");
       tumbuhan.tampilkanNama();
       tumbuhan.tampilkanUmur();
       tumbuhan.makan();
       tumbuhan.berjalan();
       tumbuhan.bersuara();
       tumbuhan.fotosintesis();

       input.close();

    //     // Membuat objek Manusia
    //     Manusia manusia = new Manusia("Elvira", 19);
    //     System.out.println("=== Data Manusia ===");
    //     manusia.tampilkanNama();
    //     manusia.tampilkanUmur();
    //     manusia.makan();
    //     manusia.berjalan();
    //     manusia.bersuara();

    //     // Membuat objek Hewan
    //     Hewan hewan = new Hewan("Kucing", 3);
    //     System.out.println("\n=== Data Hewan ===");
    //     hewan.tampilkanNama();
    //     hewan.tampilkanUmur();
    //     hewan.makan();
    //     hewan.berjalan();
    //     hewan.bersuara();

    //     // Membuat objek Tumbuhan
    //     Tumbuhan tumbuhan = new Tumbuhan("Mangga", 5);
    //     System.out.println("\n=== Data Tumbuhan ===");
    //     tumbuhan.tampilkanNama();
    //     tumbuhan.tampilkanUmur();
    //     tumbuhan.makan();
    //     tumbuhan.berjalan();
    //     tumbuhan.bersuara();
    //     tumbuhan.fotosintesis();
    // }
    }
}
