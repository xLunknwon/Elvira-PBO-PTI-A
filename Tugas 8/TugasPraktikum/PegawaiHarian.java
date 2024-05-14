package TugasPraktikum;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam(){
        return upahPerJam;
    }

    public int getTotalJam(){
        return totalJam;
    }

    public void setUpahPerJam(double upahPerJam){
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam){
        this.totalJam = totalJam;
    }

    @Override
    public double gaji(){
        if(totalJam <= 40) {
            return upahPerJam * totalJam;
        } else {
            return (upahPerJam * 40) + ((totalJam - 40) * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString(){
        return "Pegawai Harian\t: " + getNama() + "\nNo.KTP\t\t: " + getNoKTP() +
               "\nUpah/jam\t: " + getUpahPerJam() +
               "\nTotal Jam Kerja\t: " + getTotalJam() +
               "\nPendapatan\t: " + gaji();
    }
}
