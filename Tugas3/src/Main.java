import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hewan pet = null;
        Tumbuhan plant = null;

        Manusia owner = new Manusia("Elvira", 18, "Pengusaha");
        System.out.println("=== Informasi Pribadi ===");
        System.out.println("Nama: " + owner.getNama());
        System.out.println("Umur : " + owner.getUmur());
        System.out.println("Pekerjaan: " + owner.getPekerjaan());
        owner.bekerja();


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahluk Hidup");
            System.out.println("2. Lihat Data Mahluk Hidup");
            System.out.println("3. Ubah Mahluk Hidup");
            System.out.println("4. Hapus Mahluk Hidup");
            System.out.println("5. Edit Profile");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihTambah = scanner.nextInt();
                    scanner.nextLine(); 
                    if (pilihTambah == 1) {
                        pet = tambahPet(scanner); 
                    } else {
                        plant = tambahPlant(scanner); 
                    }
                    break;

                case 2:
                    lihatData(pet, plant);
                    break;

                case 3:
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihUbah = scanner.nextInt();
                    scanner.nextLine(); 
                    if (pilihUbah == 1) {
                        updatePet(scanner, pet); 
                    } else {
                        updatePlant(scanner, plant); 
                    }
                    break;

                case 4:
                    System.out.println("1. Pet");
                    System.out.println("2. Plant");
                    System.out.print("Masukkan Pilihan: ");
                    int pilihHapus = scanner.nextInt();
                    scanner.nextLine(); 
                    if (pilihHapus == 1) {
                        pet = null; 
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        plant = null;
                        System.out.println("Data berhasil dihapus!");
                    }
                    break;
                case 5:
                    updateProfile(scanner, owner);
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }
    private static void updateProfile(Scanner scanner, Manusia owner) {
        System.out.println("=== Ubah Profile ===");
            System.out.print("Nama Baru: ");
            String newNama = scanner.nextLine();
            System.out.print("Umur baru: ");
            int newUmur = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Pekerjaan baru: ");
            String newPekerjaan = scanner.nextLine();
            owner.setNama(newNama);
            owner.setUmur(newUmur);
            owner.setPekerjaan(newPekerjaan);
            System.out.println("\n=== Informasi Pribadi ===");
            System.out.println("Nama : " + newNama ); 
            System.out.println("Umur : " + newUmur); 
            System.out.println("Pekerjaan : " + newPekerjaan);
            System.out.println("Data Anda berhasil diperbarui!");
    }
    public static Hewan tambahPet(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Makanan: ");
        String makanan = scanner.nextLine();
        System.out.println("\nHewan berhasil ditambahkan!");

        return new Hewan(nama, jenis, umur, makanan);
    }

    public static Tumbuhan tambahPlant(Scanner scanner) {
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("Tinggi: ");
        double tinggi = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("\nTumbuhan berhasil ditambahkan!");

        return new Tumbuhan(nama, jenis, tinggi);
    }

    public static void lihatData(Hewan pet, Tumbuhan plant) {
        if (pet != null) {
            System.out.println("\n=== Data Pet ===");
            System.out.println("Nama: " + pet.getNama());
            System.out.println("Umur: " + pet.getUmur());
            System.out.println("Makanan: " + pet.getMakanan());
            pet.makan();
        } else {
            System.out.println("\nBelum ada data hewan.");
        }
        System.out.println("-------------------------------");
        if (plant != null) {
            System.out.println("\n=== Data Plant ===");
            System.out.println("Nama: " + plant.getNama());
            System.out.println("Jenis: " + plant.getJenis());
            System.out.println("Tinggi: " + plant.getTinggi());
            plant.fotosintesis();
        } else {
            System.out.println("\nBelum ada data tumbuhan.");
        }
    }

    public static void updatePet(Scanner scanner, Hewan pet) {
        if (pet != null) {
            System.out.print("Nama Baru: ");
            String newNama = scanner.nextLine();
            System.out.print("Jenis baru: ");
            String newJenis = scanner.nextLine();
            System.out.print("Umur baru: ");
            int newUmur = scanner.nextInt();
            scanner.nextLine(); 
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