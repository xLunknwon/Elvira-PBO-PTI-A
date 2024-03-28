class SistemSw {
    // Metode untuk melakukan transaksi pembelian
    public boolean makePurchase(CustomerAccount customerAccount, double purchaseAmount) {
        if (customerAccount.isAccountBlocked()) {
            System.out.println("Akun Anda telah diblokir karena kesalahan autentifikasi berulang.");
            return false;
        }

        if (customerAccount.makePurchase(purchaseAmount)) {
            double cashback = customerAccount.calculateCashback(purchaseAmount);
            customerAccount.topUp(cashback);
            return true; // Transaksi berhasil
        } else {
            return false; // Transaksi gagal
        }
    }
}