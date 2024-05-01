package TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        Manusia ma = new Manusia("Samsul", "111", true, true);
        System.out.println(ma);
        System.out.println("-----------------------------------");

        Manusia mb = new Manusia("Siti", "123", false, true);
        System.out.println(mb);
        System.out.println("-----------------------------------");

        Manusia mc = new Manusia("Yono", "567", true, false);
        System.out.println(mc);
        System.out.println("-----------------------------------");

        MahasiswaFILKOM fa = new MahasiswaFILKOM("235150600111100", 2.8, "Nini", "948", false, false);
        System.out.println(fa);
        System.out.println("-----------------------------------");

        MahasiswaFILKOM fb = new MahasiswaFILKOM("235150700111101", 3.2, "Nino", "949", true, false);
        System.out.println(fb);
        System.out.println("-----------------------------------");

        MahasiswaFILKOM fc = new MahasiswaFILKOM("235150600111006", 4.0, "Elvira", "950", false, false);
        System.out.println(fc);
        System.out.println("-----------------------------------");

        Pekerja pa = new Pekerja(1500, 2022, 2, 3, 2, "Budi", "711", true, true);
        System.out.println(pa);
        System.out.println("-----------------------------------");

        Pekerja pb = new Pekerja(2000, 2015, 1, 2, 0, "Yuni", "988", false, false);
        System.out.println(pb);
        System.out.println("-----------------------------------");

        Pekerja pc = new Pekerja(3000, 2004, 3, 12, 10, "Tono", "099", true, true);
        System.out.println(pc);
        System.out.println("-----------------------------------");

        Manager d = new Manager("HRD", 7500, 2009, 4, 15, 1, "Rosa", "111", false, true);
        System.out.println(d);
        System.out.println("-----------------------------------");

    }
}
