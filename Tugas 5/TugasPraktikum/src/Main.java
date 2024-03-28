import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Akun Pelanggan
        Akun[] daftarAkun = new Akun[3];
        daftarAkun[0] = new Akun("3809876543", "Elvira", "0987");
        daftarAkun[1] = new Akun("5609876543", "Rosa", "1234");
        daftarAkun[2] = new Akun("7409876543", "Khoir", "5678");

        // Input data pelanggan
        System.out.print("Masukkan nomor pelanggan: ");
        String customerId = scanner.nextLine();

        // Mencari akun yang sesuai dengan nomor pelanggan
        Akun akunCust = null;
        for (int i = 0; i < daftarAkun.length; i++) {
            if (daftarAkun[i].getCustomerId().equals(customerId)) {
                akunCust = daftarAkun[i];
                break;
            }
        }

        // Jika akun ditemukan, tampilkan saldo
        if (akunCust != null) {
            System.out.println("Halo " + akunCust.getNama() + "!" + " Selamat Datang Di Swalayan Tiny!!");
            System.out.println("Saldo anda: " + akunCust.getSaldo());
        } else {
            System.out.println("Akun tidak ditemukan.");
            scanner.close();
            return;
        }

        // Menu interaktif
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Beli barang");
            System.out.println("2. Top up saldo");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Verifikasi saldo
                    if (akunCust.getSaldo() <= 10000) {
                        System.out.println("Saldo anda tidak mencukupi untuk melakukan pembelian.\nSilahkan melakukan Top Up saldo terlebih dahulu!");
                        break;
                    }
                    // Lakukan pembelian
                    System.out.print("Masukkan jumlah pembelian: ");
                    double jumlahBeli = Double.parseDouble(scanner.nextLine());
                    // Verifikasi PIN
                    if (!verifikasi(scanner, akunCust)) {
                        exit = true;
                        break;
                    }
                    if (akunCust.pembelian(jumlahBeli)) {
                        System.out.println("Transaksi berhasil! Saldo sekarang: " + akunCust.getSaldo());
                        break;
                    }

                case 2:
                    // Lakukan top up
                    System.out.print("Masukkan jumlah top up: ");
                    double jumlahTopUp = Double.parseDouble(scanner.nextLine());
                    // Verifikasi PIN
                    if (!verifikasi(scanner, akunCust)) {
                        exit = true;
                        break;
                    }
                    akunCust.topUp(jumlahTopUp);
                    System.out.println("Saldo sekarang: " + akunCust.getSaldo());
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang benar.");
            }
        }

        scanner.close();
    }

    // Metode untuk verifikasi PIN dan menangani blokir akun
    private static boolean verifikasi(Scanner scanner, Akun akunCust) {
        int incorrectPinAttempts = 0;
        while (incorrectPinAttempts < 3) {
            System.out.print("Masukkan PIN: ");
            String enteredPIN = scanner.nextLine();
            if (!akunCust.verifikasi(enteredPIN)) {
                System.out.println("PIN salah.");
                incorrectPinAttempts++;
                if (incorrectPinAttempts >= 3) {
                    System.out.println("Anda telah melakukan 3x kesalahan dalam memasukkan PIN. Akun Anda akan diblokir.");
                    akunCust.blokirAkun();
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}