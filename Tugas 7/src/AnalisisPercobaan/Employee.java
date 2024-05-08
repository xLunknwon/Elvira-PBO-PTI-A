package AnalisisPercobaan;

import java.time.LocalDate;

public abstract class Employee { 
    private String name; 
    private String noKTP; 
    private LocalDate tglLahir;
    private LocalDate tglSekarang;
    // private int totalProduk;
    // private double hargaProduk = 5000;

    public Employee(String name, String noKTP, LocalDate tglLahir){ 
        this.name = name; 
        this.noKTP = noKTP;
        this.tglLahir = tglLahir;
        this.tglSekarang = LocalDate.now(); 
        // this.totalProduk = totalProduk;
    } 

    // public double totalharga(){
    //    return totalProduk * hargaProduk; 
    // }
    public String getName(){ 
        return name; 
    } 
    public String getNoKTP(){ 
        return noKTP; 
    } 
    public LocalDate getTglLahir(){
        return tglLahir;
    }
    public LocalDate getTglSekarang(){
        return tglSekarang;
    }
    public String toString(){ 
        return String.format(" "+getName()+"\nNo. KTP :"+getNoKTP() +  "\nTanggal Lahir: " + getTglLahir()); 
    } 
    public abstract double earnings();//pendapatan 
} 