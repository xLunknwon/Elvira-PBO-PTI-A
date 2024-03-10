import java.util.*;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan Kecepatan: ");
        int kecepatan = input.nextInt();
        m1.setKecepatan(kecepatan);
        input.nextLine();
        System.out.print("Masukkan Manufaktur: ");
        String manufaktur = input.nextLine();
        m1.setManufaktur(manufaktur);
        System.out.print("Masukkan No.Plat: ");
        String noPlat = input.nextLine();
        m1.setNoPlat(noPlat);
        System.out.print("Masukkan Warna: ");
        String warna = input.nextLine();
        m1.setWarna(warna);
        System.out.print("Masukkan waktu(hour): ");
        double waktu = input.nextDouble();
        m1.setWaktu(waktu);
        m1.hitungJarak(waktu);
        m1.jarakKilo();
        m1.displayMessage();
        System.out.println("================");
        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan Kecepatan: ");
        int kecepatan2 = input.nextInt();
        m2.setKecepatan(kecepatan2);
        input.nextLine();
        System.out.print("Masukkan Manufaktur: ");
        String manufaktur2 = input.nextLine();
        m2.setManufaktur(manufaktur2);
        System.out.print("Masukkan No.Plat: ");
        String noPlat2 = input.nextLine();
        m2.setNoPlat(noPlat2);
        System.out.print("Masukkan Warna: ");
        String warna2 = input.nextLine();
        m2.setWarna(warna2);
        System.out.print("Masukkan waktu(hour): ");
        double waktu2 = input.nextDouble();
        m2.setWaktu(waktu2);
        m2.hitungJarak(waktu2);
        m2.jarakKilo();
        m2.displayMessage();
        System.out.println("================");
        // merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna hijau");
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
