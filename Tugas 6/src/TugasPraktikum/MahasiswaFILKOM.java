package TugasPraktikum;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getStatus() {
        int prodi = Character.getNumericValue(nim.charAt(6));
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        String[] namaProdi = { "Teknik Informatika", "Teknik Komputer", "Sistem Informasi", "",
                "Pendidikan Teknologi Informasi", "Teknologi Informasi" };
        return namaProdi[prodi - 2] + ", " + (2000 + angkatan);
    }

    public double getPendapatan() {
        return getBeasiswa() + getTunjangan();
    }

    public double getBeasiswa(){
        if (ipk >= 3.5 && ipk == 4.0) {
            return 75.0;
        } else if (ipk >= 3.0 && ipk < 3.5) {
            return 50.0;
        } else {
            return 0.0;
        }
    }

    public String toString() {
        return super.toString() + "\nNIM          : " + nim + 
                "\nIPK          : " + ipk + 
                "\nStatus       : " + getStatus();
    }
}
