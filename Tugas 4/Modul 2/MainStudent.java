import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Siswa: ");
        int n = input.nextInt();
        Student[] siswaList = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk siswa ke-" + (i + 1) + ":");
            System.out.print("Masukkan Nama: ");
            String nama = input.next();
            System.out.print("Masukkan Alamat: ");
            String alamat = input.next();
            System.out.print("Masukkan Umur: ");
            int umur = input.nextInt();
            System.out.print("Masukkan Nilai Matematika: ");
            double math = input.nextDouble();
            System.out.print("Masukkan Nilai Bahasa Inggris: ");
            double english = input.nextDouble();
            System.out.print("Masukkan Nilai IPA: ");
            double science = input.nextDouble();

            // Membuat objek Student dengan data yang dimasukkan
            siswaList[i] = new Student(nama, alamat, umur, math, english, science);
        }
        System.out.println("\nInformasi Siswa:");
        for (int i = 0; i < n; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ":");
            siswaList[i].displayMessage();
            System.out.println(); // Spasi antar siswa
        }

        input.close();
        for (int i = 0; i < n; i++) {
            // Memanggil konstruktor untuk membuat objek Student
            siswaList[i] = new Student();
        }
        Student.jmlObjek();
        System.out.println();

        Student anna = new Student();
        anna.setName("Anna");
        anna.setAddress("Malang");
        anna.setAge(20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        anna.displayMessage();

        // menggunakan constructor lain
        System.out.println("===================");
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();

        // siswa dengan nama anna dirubah informasi alamat dan umurnya melalui
        // constructor
        System.out.println("===================");
        anna = new Student("anna", "Batu", 18);
        anna.displayMessage();

        // siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        // membuat objek dengan parameter semua mapel
        System.out.println("===================");
        Student rosa = new Student("Rosa", "Tuban", 20, 87, 90, 95);
        rosa.displayMessage();

    }
}