package AnalisisPercobaan;

public class Main {
    public static void main(String[] args) {
        // no.1 fungsi extends dan super
        // extends digunakan untuk menunjukkan bahwa suatu kelas (subclass) adalah
        // turunan dari kelas lain (superclass).
        // Dengan menggunakan extends, subclass mewarisi semua properti dan method dari
        // superclass.
        // super digunakan untuk merujuk ke superclass langsung dari subclass.
        // Ini dapat digunakan untuk memanggil constructor superclass atau method yang
        // ada di superclass.
        // super() dalam constructor subclass digunakan untuk memanggil constructor
        // superclass
        // dan menginisialisasi properti yang diwarisi dari superclass.

        // no.2 this pada setter dan getter
        // this adalah referensi ke objek saat ini (current object). Ini digunakan untuk
        // membedakan antara properti kelas dan parameter method atau constructor yang
        // memiliki nama yang sama.
        // Dalam constructor, this digunakan untuk menginisialisasi properti objek
        // dengan nilai yang diberikan melalui parameter constructor.
        // Dalam setter, this digunakan untuk menetapkan nilai properti objek dengan
        // nilai yang diberikan melalui parameter method.
        // Dalam getter, this biasanya tidak diperlukan karena properti yang diakses
        // jelas milik objek saat ini, namun bisa digunakan untuk kejelasan kode.

        // casting
        // doubleangka=5.4;
        // intangka_int=(int)angka;
        // System.out.println(angka_int);
        // ObjectdenganclassHeroIntel
        HeroIntel hero1 = new HeroIntel("Ucup", 100);
        hero1.display();
        // upcasting
        Hero heroUp = (Hero) hero1;
        heroUp.display();
        // System.out.println(heroUp.getType());//inierror
        // ObjectdgnclassHero
        Hero heroReg = new Hero("Boy", 100);
        heroReg.display();
        // downcasting
        // HeroAgilityheroDown=(HeroAgility)heroReg;//inierror
        // heroDown.display();
        // heroUpdikembalikankehero1
        HeroIntel hero2 = (HeroIntel) heroUp;
        hero2.display();// iniberhasildowncasting

        // no.3
        // Pada output terjadi error karena objek heroUp yang dibuat dari class
        // heroIntel tidak bisa ditransmisikan menjadi hero agility
        // HeroAgility hero3 = (HeroAgility) heroUp;
        // hero3.display();

        // no.4 Ubahlah modifier atribut type pada class HeroIntel dan HeroAgility
        // menjadi public, lalu coba akses
        // langsung melalui class Main. Apakah atribut bisa diakses langsung atau tidak,
        // jelaskan!
        System.out.println("\nHero Agility");
        HeroAgility hero4 = new HeroAgility("el", 100);
        System.out.println(hero4.getName() + " is " + hero4.type + " Hero");

        System.out.println("\nHero Intel");
        HeroIntel hero5 = new HeroIntel("veer", 90);
        System.out.println(hero5.getName() + " is " + hero5.type + " Hero");

        // // no.5 Buatlah class baru HeroMagic dengan atribut tambahan power = “Magic”
        // serta extends semua atribut dan method dari class Hero. Kemudian coba buatlah
        // kode untuk upcasting dan downcasting
        // dari class HeroMagic ke Hero pada class Main!
        // Object dari class HeroMagic
        System.out.println("\nHero Magic");
        HeroMagic heroMagic = new HeroMagic("jeje", 150);
        // heroMagic.display();

        // Upcasting
        Hero heroUp2 = heroMagic;
        System.out.println("\nupcasting");
        heroUp2.display();

        // HeroMagic heroDown = new HeroMagic("jeje", 100);
        System.out.println("\ndowncasting");
        HeroMagic heroDown = (HeroMagic) heroUp2;
        heroDown.display();

    }
}
