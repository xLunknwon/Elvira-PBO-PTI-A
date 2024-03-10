import java.util.*;
import java.io.*;

public class Perpustakaan {
    Scanner input = new Scanner(System.in);
    public String nama;
    public String nim;
    public String prodi;
    private int kategori;
    public String judulBuku;
    public String penulis;
    public int tanggal;
    public String bulanTahun;
    public String[] kategoriBuku = { "Agama", "Teknologi", "Filsafat", "Politik", "Sejarah", "Psikologi", "Fiksi" };

    public void home() {
        System.out.println("----------------------------------------------");
        System.out.println("Halo " + nama + ", mau cari buku apa nichh\n");
        do {
            System.out.println("=== Kategori ===");
            System.out.println("1. Agama");
            System.out.println("2. Teknologi");
            System.out.println("3. Filsafat");
            System.out.println("4. Politik");
            System.out.println("5. Sejarah");
            System.out.println("6. Psikologi");
            System.out.println("7. Fiksi");
            System.out.print("Mau yang mana? (ketik 8 jika mau keluar): ");
            kategori = input.nextInt();
            input.nextLine();
            clearScreen();
            System.out.println("---------------------------------------------------------");
            switch (kategori) {
                case 1:
                    System.out.println("=== Kategori Agama ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/agama.txt");
                    pinjam(kategori);

                    break;
                case 2:
                    System.out.println("=== Kategori Teknologi ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/teknologi.txt");
                    pinjam(kategori);
                    break;
                case 3:
                    System.out.println("=== Kategori Filsafat ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/filsafat.txt");
                    pinjam(kategori);
                    break;
                case 4:
                    System.out.println("=== Kategori Politik ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/politik.txt");
                    pinjam(kategori);
                    break;
                case 5:
                    System.out.println("=== Kategori Sejarah ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/sejarah.txt");
                    pinjam(kategori);
                    break;
                case 6:
                    System.out.println("=== Kategori Psikologi ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/psikologi.txt");
                    pinjam(kategori);
                    break;
                case 7:
                    System.out.println("=== Kategori Fiksi ===");
                    aksesFile("E:/kulyeah/smt 2/praktikum2/fiksi.txt");
                    pinjam(kategori);
                    break;
                case 8:
                    System.out.println("Terimakasih!!");
                    delay(500);
                    clearScreen();
                    System.exit(0);
                default:
                    System.out.println("Kategori tidak valid");
            }
        } while (kategori != 8);
    }

    public void pinjam(int pinjamPilih) {
        System.out.println("\nMau pinjam? ");
        System.out.println("1. Ya dong!!");
        System.out.println("2. Ndak duyu");
        System.out.print("Masukkan jawaban: ");
        pinjamPilih = input.nextInt();
        if (pinjamPilih == 1) {
            System.out.print("Masukkan Judul Buku: ");
            input.nextLine();
            judulBuku = input.nextLine();
            System.out.print("Masukkan Tanggal Pinjam : ");
            tanggal = input.nextInt();
            System.out.print("Masukkan Bulan dan Tahun: ");
            input.nextLine();
            bulanTahun = input.nextLine();
            clearScreen();
            System.out.println("-----------------------------------------------");
            System.out.println("Yeay! Kamu Berhasil Meminjam Buku " + judulBuku);
            System.out.println("Tanggal Pinjam: " + tanggal + " " + bulanTahun);
            System.out.println("Tanggal Kembali: " + (tanggal + 7) + " " + bulanTahun);
            delay(4000);
            clearScreen();
            home();
            ;
        } else {
            clearScreen();
            home();
        }
    }

    public void aksesFile(String namaFile) {
        try {
            File infoBukuAgama = new File(namaFile);
            Scanner input = new Scanner(infoBukuAgama);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan" + e.getMessage());
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(int sleep) {
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}