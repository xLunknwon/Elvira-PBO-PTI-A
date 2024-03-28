class Akun {
    private double saldo;
    private String customerId;
    private String pin;
    private String nama;
    private boolean blocked;
    private int nPinSalah;

    // Constructor
    public Akun(String customerId, String nama, String pin) {
        this.customerId = customerId;
        this.nama = nama;
        this.pin = pin;
        this.saldo = 10000; // Saldo awal
        this.blocked = false; // Akun tidak diblokir saat dibuat
        this.nPinSalah = 0; // Jumlah kesalahan PIN awal adalah 0
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCustomerId() {
        return customerId;
    }

    // Metode untuk melakukan pembelian
    public boolean pembelian(double jml) {
        if (saldo < 10000) {
            System.out.println("Transaksi gagal. Saldo minimal Rp10.000.");
            return false;
        }

        if (jml > saldo || saldo - jml < 10000) {
            System.out.println("Transaksi gagal. Saldo tidak mencukupi.");
            return false;
        }

        double presentaseCashback = 0.0;
        switch (customerId.substring(0, 2)) {
            case "38":
                if (jml > 1000000) {
                    presentaseCashback = 0.05;
                }
                break;
            case "56":
                if (jml > 1000000) {
                    presentaseCashback = 0.07;
                } else {
                    presentaseCashback = 0.02;
                }
                break;
            case "74":
                if (jml > 1000000) {
                    presentaseCashback = 0.10;
                } else {
                    presentaseCashback = 0.05;
                }
                break;
            default:
                System.out.println("Jenis pelanggan tidak dikenali.");
                return false;
        }

        double cashback = presentaseCashback * jml;
        saldo -= jml;
        saldo += cashback; // Menambahkan cashback ke saldo

        if (cashback > 0) {
            System.out.println("Transaksi Berhasil");
            System.out.println("Cashback yang Anda dapatkan: Rp" + cashback);
        }
        return true;
    }

    // Metode untuk melakukan top up saldo
    public void topUp(double jml) {
        saldo += jml;
        System.out.println("Top up berhasil. Saldo sekarang: " + saldo);
    }

    // Metode untuk memeriksa dan memverifikasi PIN
    public boolean verifikasi(String pinInput) {
        if (pinInput.equals(pin)) {
            // Reset jumlah kesalahan PIN setelah verifikasi sukses
            nPinSalah = 0;
            return true;
        } else {
            // Tambahkan jumlah kesalahan PIN jika PIN salah
            nPinSalah++;
            return false;
        }
    }

    // Metode untuk memeriksa apakah akun sudah diblokir
    public boolean isBlocked() {
        return blocked;
    }

    // Metode untuk memblokir akun
    public void blokirAkun() {
        blocked = true;
    }

    // Metode untuk memeriksa jumlah kesalahan PIN
    public int getnPinSalah() {
        return nPinSalah;
    }
}
