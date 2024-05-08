package AnalisisPercobaan;

import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;//gaji pokok tiap minggu 
 
    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary, LocalDate tglLahir) { 
        super(name, noKTP, sales, rate, tglLahir); 
        setBaseSalary(salary); 
    } 
 
    public void setBaseSalary(double salary) { 
        baseSalary = salary; 
    } 
 
    public double getBaseSalary() { 
        return baseSalary; 
    } 
 
    public double earnings() { 
        return getBaseSalary() + super.earnings(); 
    } 
 
    public String toString() { 
        return String.format("Base-Salaried " + super.toString() + "\nbase salary " + getBaseSalary()); 
    } 
} 

