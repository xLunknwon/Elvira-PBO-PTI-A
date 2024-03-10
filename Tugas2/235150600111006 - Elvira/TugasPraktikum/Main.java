import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Perpustakaan abc = new Perpustakaan();
        System.out.println("=== Didata Duls Yaa ===");
        System.out.print("Masukkan Nama Lengkap: ");
        abc.nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        abc.nim = input.nextLine();
        System.out.print("Masukkan Prodi: ");
        abc.prodi = input.nextLine();
        try {
            FileWriter dataPengunjung = new FileWriter("E:/kulyeah/smt 2/Object Oriented Programming/Elvira-PBO-PTI-A/Tugas2/235150600111006 - Elvira/TugasPraktikum/DataPengunjung.txt");
            dataPengunjung.write("Nama          : " + abc.nama + "\n");
            dataPengunjung.write("NIM           : " + abc.nim + "\n");
            dataPengunjung.write("Program Studi : " + abc.prodi + "\n");
            dataPengunjung.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
        abc.clearScreen();
        System.out.println("Selamat datang di aplikasi Libraryeahh");
        abc.delay(800);
        abc.clearScreen();
        abc.home();
    }
}