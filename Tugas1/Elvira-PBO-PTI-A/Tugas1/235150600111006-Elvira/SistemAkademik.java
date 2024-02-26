import java.util.Scanner;

public class SistemAkademik {

    static Scanner input = new Scanner(System.in);
    static String[][] users = { { "23515", "pw123" } };
    static String nim = "23515";
    static String nama = "Elvira Rosa";
    static String jenjangFakultas = "S1/Fakultas Ilmu Komputer";
    static String prodi = "Pendidikan Teknologi Informasi";
    static String status = "AKTIF";
    static String[] mataKuliah = { "Statistika", "Matematika Komputasi", "PBO" };
    static String[] kodeMatkul = { "COM1234", "COM5678", "COM9012" };
    static int[][] presensi = new int[mataKuliah.length][3];

    public static void main(String[] args) {
        login();
    }

    static void login() {
        System.out.println("=== Login Mahasiswa ===");
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        boolean isLoggedIn = false;
        for (String[] user : users) {
            if (user[0].equals(nim) && user[1].equals(password)) {
                isLoggedIn = true;
                break;
            }
        }

        if (isLoggedIn) {
            System.out.println("Login berhasil!");
            delay();
            clearScreen();
            home();
            menu();
        } else {
            System.out.println("Login gagal! Periksa kembali NIM dan password Anda!");
            System.out.println("---------------------------------------------------------");
            input.nextLine();
            login();
        }
    }

    static void home() {
        System.out.println("\n=== AKADEMIK ===");
        System.out.println("NIM              : " + nim);
        System.out.println("Nama             : " + nama);
        System.out.println("Jenjang/Fakultas : " + jenjangFakultas);
        System.out.println("\nStatus : " + status);
    }

    static void menu() {
        int choice;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Presensi Online");
            System.out.println("2. Absensi");
            System.out.println("3. Jadwal Kuliah");
            System.out.println("4. Log Out");
            System.out.print("Pilih menu: ");
            choice = input.nextInt();
            input.nextLine();
            System.out.println("---------------------------------------------------------");

            switch (choice) {
                case 1:
                    clearScreen();
                    presensiMataKuliah();
                    break;
                case 2:
                    clearScreen();
                    lihatDataPresensi();
                    break;
                case 3:
                    clearScreen();
                    jadwalMatkul();
                    break;
                case 4:
                    clearScreen();
                    login();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 4);
    }

    static void jadwalMatkul() {
        System.out.println("\n=== Jadwal Kuliah ===");
        System.out.println("--------------------------------------------------------------------------------------------------");
        cetakBarisJadwal("HARI", "JAM", "KELAS", "KODE", "MATA KULIAH", "DOSEN", "RUANG");
        System.out.println("--------------------------------------------------------------------------------------------------");
        cetakBarisJadwal("Senin", "07:00-08:40", "A", kodeMatkul[0], "Statistika", "Nisa, S.Pd, M.Kom", "F2.5");
        cetakBarisJadwal("Selasa", "10:00-12:00", "A", kodeMatkul[1], "Matematika Komputasi", "Rosa, S.T, M.Kom", "F4.1");
        cetakBarisJadwal("Rabu", "07:00-09:29", "A", kodeMatkul[2], "PBO", "Khoiren, S.Kom, M.MT", "F2.3");
        System.out.println("--------------------------------------------------------------------------------------------------");
    }

    static void cetakBarisJadwal(String hari, String jam, String kelas, String kode, String mataKuliah, String dosen, String ruang) {
        System.out.printf("| %-8s | %-11s | %-5s | %-7s | %-20s | %-20s | %-5s |\n", hari, jam, kelas, kode, mataKuliah, dosen, ruang);
    }

    static boolean[] sudahPresensi = new boolean[mataKuliah.length];

    static void presensiMataKuliah() {
        System.out.println("\n=== Presensi Mata Kuliah ===");
        System.out.println("Pilih Mata Kuliah:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.print("Pilih mata kuliah yang akan di-presensi (1-" + mataKuliah.length + "): ");
        int choice = input.nextInt();
        input.nextLine();
        clearScreen();

        if (choice >= 1 && choice <= mataKuliah.length) {
            if (sudahPresensi[choice - 1]) {
                System.out.println("\nANDA SUDAH MELAKUKAN PRESENSI PADA MATA KULIAH INI!");
            } else {
                System.out.println("Pilih jenis presensi:");
                System.out.println("1. Hadir (Luring)");
                System.out.println("2. Hadir (Daring)");
                System.out.println("3. Izin");
                System.out.print("Pilihan Anda: ");
                int presensiType = input.nextInt();
                input.nextLine();

                if (presensiType >= 1 && presensiType <= 3) {
                    presensi[choice - 1][presensiType - 1]++;
                    System.out.println("\nPRESENSI BERHASIL!");
                    sudahPresensi[choice - 1] = true;
                } else {
                    System.out.println("Pilihan tidak valid!");
                }
                delay();
                clearScreen();
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    static void lihatDataPresensi() {
        System.out.println("\n=== Data Presensi ===");
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("| Kode Matkul | Mata Kuliah          | Kelas | Hadir(L) | Hadir(D) | Izin | Persentase  |");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (int i = 0; i < mataKuliah.length; i++) {
            int totalPresensi = presensi[i][0] + presensi[i][1] + presensi[i][2];
            double persentase = (totalPresensi / 1.0) * 100.0;
            System.out.printf("| %-11s | %-20s | %-5s | %-8d | %-8d | %-4d | %-10.1f%% |\n", kodeMatkul[i], mataKuliah[i], "A", presensi[i][0], presensi[i][1], presensi[i][2], persentase);
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}