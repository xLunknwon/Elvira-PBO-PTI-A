public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private double waktuSekon;
    private double kecepatanSekon;
    private double jarak;
    private double jarakKm;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = i;
        rubahKecepatan(i);
    }

    public void setWaktu(double d) {
        waktu = d;
        rubahSekon(d);
    }

    private void rubahSekon(double d) {
        waktuSekon = waktu * 3600;
        System.out.println("debug rubah sekon: " + waktuSekon);
    }

    private void rubahKecepatan(double d) {
        kecepatanSekon = (kecepatan * 1000) / 3600;
    }

    public void hitungJarak(double d) {
        jarak = kecepatanSekon * waktuSekon;
        System.out.println("debug kecepatan sekon: " + kecepatanSekon);
    }

    public void jarakKilo() {
        jarakKm = jarak / 1000;
        System.out.println("jarak dalam kilo adalah: " + jarakKm);
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
        System.out.println("Debug Jarak dalam meter : " + jarak + " M");
        System.out.println("Jarak yang di tempuh adalah " + jarakKm + " Km");
    }
}
