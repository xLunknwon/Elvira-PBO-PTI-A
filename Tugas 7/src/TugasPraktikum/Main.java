package TugasPraktikum;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kue[] listKue = new Kue[20];
        listKue[0] = new KuePesanan("Brownies", 10000, 0.5);
        listKue[1] = new KuePesanan("Donat", 5000, 0.3);
        listKue[2] = new KueJadi("Lapis Legit", 150000, 2);
        listKue[3] = new KueJadi("Tiramisu", 200000, 1);
        listKue[4] = new KuePesanan("Martabak Manis", 20000, 1.5);
        listKue[5] = new KuePesanan("Kue Lumpur", 12000, 0.8);
        listKue[6] = new KueJadi("Pandan Cake", 80000, 3);
        listKue[7] = new KueJadi("Cheesecake", 180000, 1);
        listKue[8] = new KuePesanan("Kue Cubit", 3000, 0.2);
        listKue[9] = new KuePesanan("Bolu Gulung", 25000, 0.7);
        listKue[10] = new KueJadi("Red Velvet Cake", 250000, 2);
        listKue[11] = new KueJadi("Opera Cake", 220000, 1);
        listKue[12] = new KuePesanan("Sosis Solo", 15000, 0.5);
        listKue[13] = new KuePesanan("Pastel", 7000, 0.4);
        listKue[14] = new KueJadi("Black Forest Cake", 180000, 2);
        listKue[15] = new KueJadi("Rainbow Cake", 200000, 1);
        listKue[16] = new KueBasi("Cupcake", 6000, 3);
        listKue[17] = new KuePesanan("Pia", 10000, 0.6);
        listKue[18] = new KueBasi("Kue Kukus", 200000, 2);
        listKue[19] = new KueBasi("Lumpur", 150000, 1);

        boolean exit = false;
        while (!exit) {
            System.out.println("----------------------------------------------------------");
            System.out.println("Pilihan Menu:");
            System.out.println("1. Tampilkan semua kue dan jenisnya");
            System.out.println("2. Hitung total harga dari semua jenis kue");
            System.out.println("3. Hitung total harga dan total berat dari KuePesanan");
            System.out.println("4. Hitung total harga dan total jumlah dari KueJadi");
            System.out.println("5. Tampilkan informasi kue dengan harga terbesar");
            System.out.println("6. Hitung total harga dan total lama hari dari KueBasi");
            System.out.println("7. Keluar");

            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n====== Semua Kue ======");
                    for (int i = 0; i < listKue.length; i++) {
                        if (listKue[i] != null) {
                            System.out.println((i + 1) + ". " + listKue[i].toString());
                        }
                    }
                    break;
                case 2:
                    double totalHargaSemua = 0;
                    for (Kue kue : listKue) {
                        if (kue != null) {
                            totalHargaSemua += kue.hitungHarga();
                        }
                    }
                    System.out.println("\n====== Total Harga ======");
                    System.out.println("Total harga semua kue: Rp " + totalHargaSemua);
                    break;
                case 3:
                    double totalHargaPesanan = 0;
                    double totalBeratPesanan = 0;
                    for (Kue kue : listKue) {
                        if (kue instanceof KuePesanan) {
                            totalHargaPesanan += kue.hitungHarga();
                            totalBeratPesanan += ((KuePesanan)kue).getBerat();
                        }
                    }
                    System.out.println("\n=== Total Harga dan Berat ===");
                    System.out.println("Total harga kue pesanan: Rp " + totalHargaPesanan);
                    System.out.println("Total berat kue pesanan: " + totalBeratPesanan + " kg");
                    break;
                    case 4:
                    double totalHargaJadi = 0;
                    int totalJumlahJadi = 0;
                    for (Kue kue : listKue) {
                        if (kue instanceof KueJadi) {
                            totalHargaJadi += kue.hitungHarga();
                            totalJumlahJadi += ((KueJadi)kue).getJumlah();
                        }
                    }
                    System.out.println("\n== Total Harga dan Jumlah Kue Jadi ==");
                    System.out.println("Total harga kue jadi: Rp " + totalHargaJadi);
                    System.out.println("Total jumlah kue jadi: " + totalJumlahJadi);
                    break;
                case 5:
                    double maxHarga = Double.MIN_VALUE;
                    Kue kueMaxHarga = null;
                    for (Kue kue : listKue) {
                        if (kue != null && kue.hitungHarga() > maxHarga) {
                            maxHarga = kue.hitungHarga();
                            kueMaxHarga = kue;
                        }
                    }
                    System.out.println("\n====== Harga Tertinggi ======");
                    System.out.println("Kue dengan harga tertinggi: \n" + kueMaxHarga.toString());
                    break;
                case 6:
                    double totalHargaBasi = 0;
                    int totalLamaHariBasi = 0;
                    for (Kue kue : listKue) {
                        if (kue instanceof KueBasi) {
                            totalHargaBasi += kue.hitungHarga();
                            totalLamaHariBasi += ((KueBasi)kue).getLamaHari();
                        }
                    }
                    System.out.println("\n======Kue Basi======");
                    System.out.println("Total harga kue basi: Rp " + totalHargaBasi);
                    System.out.println("Total lama hari kue basi: " + totalLamaHariBasi);
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        }
        scanner.close();
    }
}
