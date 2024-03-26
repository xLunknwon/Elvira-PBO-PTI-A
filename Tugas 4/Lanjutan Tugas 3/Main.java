import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Manusia untuk pemilik
        Manusia owner = new Manusia("Elvira", 18, "Pengusaha");

        // Menampilkan informasi pribadi pemilik
        System.out.println("=== Informasi Pribadi ===");
        System.out.println("Nama: " + owner.getNama());
        System.out.println("Umur : " + owner.getUmur());
        System.out.println("Pekerjaan: " + owner.getPekerjaan());
        owner.bekerja(); // Memanggil method bekerja dari objek Manusia

        Hewan pet = new Hewan(null, null, 0);
        Hewan hewan2 = new Hewan("Kuro", "Anjing", 5, "Daging");
        Hewan hewan3 = new Hewan("Flowii", "Burung", 2, "Biji-bijian");

        // Deklarasi variabel untuk menyimpan data hewan dan tumbuhan
        // Hewan pet = null;
        Tumbuhan plant = null;

        // Memulai loop utama program
        while (true) {
            // Menampilkan menu interaktif
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahluk Hidup");
            System.out.println("2. Lihat Data Mahluk Hidup");
            System.out.println("3. Ubah Mahluk Hidup");
            System.out.println("4. Hapus Mahluk Hidup");
            System.out.println("5. Edit Profile");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            // Mengambil input pilihan dari pengguna
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline di buffer

            // Menggunakan switch case untuk menangani pilihan pengguna
            switch (pilihan) {
                case 1: // Requirement: Tambahkan Mahluk Hidup
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihTambah = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline di buffer
                    if (pilihTambah == 1) {
                        pet = tambahPet(scanner); // Memanggil method tambahPet
                    } else {
                        plant = tambahPlant(scanner); // Memanggil method tambahPlant
                    }
                    break;

                case 2: // Requirement: Lihat Data Mahluk Hidup
                    lihatData(pet, plant); // Memanggil method lihatData
                    System.out.println("==================================================");
                    System.out.println("Data hewan 2: " + "namanya " + hewan2.getNama()+ " berjenis " + hewan2.getJenis()+ " umurnya " + hewan2.getUmur()+ " suka makan " + hewan2.getMakanan());
                    System.out.println("Data hewan 3: " + "namanya " + hewan3.getNama() + " berjenis " + hewan3.getJenis()+ " umurnya " + hewan3.getUmur()+ " suka makan " + hewan3.getMakanan());
                    break;

                case 3: // Requirement: Ubah Mahluk Hidup
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihUbah = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline di buffer
                    if (pilihUbah == 1) {
                        updatePet(scanner, pet); // Memanggil method updatePet
                    } else {
                        updatePlant(scanner, plant); // Memanggil method updatePlant
                    }
                    break;

                case 4: // Requirement: Hapus Mahluk Hidup
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihHapus = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline di buffer
                    if (pilihHapus == 1) {
                        pet = null;
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        plant = null;
                        System.out.println("Data berhasil dihapus!");
                    }
                    break;
                case 5: // Requirement: Edit Profile
                    updateProfile(scanner, owner); // Memanggil method updateProfile
                    break;
                case 0: // Requirement: Keluar dari program
                    System.out.println("Terima kasih!");
                    scanner.close(); // Menutup scanner
                    System.exit(0); // Keluar dari program
                default: // Handling jika pilihan tidak valid
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    // Requirement: Method untuk mengubah profil pemilik
    private static void updateProfile(Scanner scanner, Manusia owner) {
        System.out.println("=== Ubah Profile ===");
        System.out.print("Nama Baru: ");
        String newNama = scanner.nextLine();
        System.out.print("Umur baru: ");
        int newUmur = scanner.nextInt();
        scanner.nextLine(); // Membuang newline di buffer
        System.out.print("Pekerjaan baru: ");
        String newPekerjaan = scanner.nextLine();
        owner.setNama(newNama);
        owner.setUmur(newUmur);
        owner.setPekerjaan(newPekerjaan);
        System.out.println("\n=== Informasi Pribadi ===");
        System.out.println("Nama : " + newNama);
        System.out.println("Umur : " + newUmur);
        System.out.println("Pekerjaan : " + newPekerjaan);
        System.out.println("Data Anda berhasil diperbarui!");
    }

    // Requirement: Method untuk menambahkan hewan

    public static Hewan tambahPet(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membuang newline di buffer
        System.out.print("Makanan: ");
        String makanan = scanner.nextLine();
        System.out.println("\nHewan berhasil ditambahkan!");

        return new Hewan(nama, jenis, umur, makanan); // Mengembalikan objek Hewan
    }

    // Requirement: Method untuk menambahkan tumbuhan
    public static Tumbuhan tambahPlant(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        scanner.nextLine(); // Membuang newline di buffer
        System.out.println("\nTumbuhan berhasil ditambahkan!");

        return new Tumbuhan(nama, jenis, tinggi); // Mengembalikan objek Tumbuhan
    }

    // Requirement: Method untuk melihat data hewan dan tumbuhan
    public static void lihatData(Hewan pet, Tumbuhan plant) {
        if (pet != null) {
            System.out.println("\n=== Data Pet ===");
            System.out.println("Nama: " + pet.getNama());
            System.out.println("Umur: " + pet.getUmur());
            System.out.println("Makanan: " + pet.getMakanan());
            // Memanggil method makan dari objek Hewan
            pet.makan();
            pet.makan("Wishkas");
            pet.makan(2);
        } else {
            System.out.println("\nBelum ada data hewan.");
        }
        System.out.println("-------------------------------");
        if (plant != null) {
            System.out.println("\n=== Data Plant ===");
            System.out.println("Nama: " + plant.getNama());
            System.out.println("Jenis: " + plant.getJenis());
            System.out.println("Tinggi: " + plant.getTinggi());
            plant.fotosintesis(); // Memanggil method fotosintesis dari objek Tumbuhan
        } else {
            System.out.println("\nBelum ada data tumbuhan.");
        }
    }

    // Requirement: Method untuk mengubah data hewan
    public static void updatePet(Scanner scanner, Hewan pet) {
        if (pet != null) {
            System.out.print("Nama Baru: ");
            String newNama = scanner.nextLine();
            System.out.print("Jenis baru: ");
            String newJenis = scanner.nextLine();
            System.out.print("Umur baru: ");
            int newUmur = scanner.nextInt();
            scanner.nextLine(); // Membuang newline di buffer
            System.out.print("Makanan baru: ");
            String newMakanan = scanner.nextLine();

            pet.setNama(newNama);
            pet.setJenis(newJenis);
            pet.setUmur(newUmur);
            pet.setMakanan(newMakanan);
            System.out.println("Data hewan berhasil diperbarui!");
        } else {
            System.out.println("Belum ada data hewan. Silakan tambahkan hewan terlebih dahulu.");
        }
    }

    // Requirement: Method untuk mengubah data tumbuhan
    public static void updatePlant(Scanner scanner, Tumbuhan plant) {
        if (plant != null) {
            System.out.println("Nama baru: ");
            String newNama = scanner.nextLine();
            System.out.print("Jenis baru: ");
            String newJenis = scanner.nextLine();
            System.out.print("Tinggi baru: ");
            double newTinggi = scanner.nextDouble();
            scanner.nextLine();

            plant.setNama(newNama);
            plant.setJenis(newJenis);
            plant.setTinggi(newTinggi);
            System.out.println("Data tumbuhan berhasil diperbarui!");
        } else {
            System.out.println("Belum ada data tumbuhan. Silakan tambahkan tumbuhan terlebih dahulu.");
        }
    }
}
