package AnalisisPercobaan;

import java.time.LocalDate;

// no. 1
// Jalankan Main.java untuk polymorfisme Employee, analisis dan jelaskan keluaran program tersebut!
// Jawab:
// Terjadi error pada program tersebut, karena pada class Employee merupakan class abstract, 
// sehingga tidak bisa diinstansisai langsung pada main class.
// public class Main { 
//     public static void main(String[] args) { 
//          Employee employee = new Employee(); 
//      } 
//  } 
// no.2
// Jalankan main
// // jawab: Setelah dijalankan, program memiliki 2 jenis output, 
// yaitu Employee yang di proses secara terpisah dan Employee yang di proses secara polimorfism. 
// Untuk output yang pertama yaitu dengan proses secra terpisah ini mengoutput objek menggunakan toString 
// dan langusng mengakses ke empat subscalss nya, yaitu class SalariedEmployee, HourlyEmployee,
// CommissionEmployee, dan BasePlusCommissionEmployee. Sedangkan pada jenis output kedua yaitu 
// dengan menerapkan konsep polimorfisme, dimana dengan menggunakan polimorfisme ini keempat subsclassnya 
// dimasukkan kedalam superclass nya yaitu class Employee dengan menggunakan for each untuk mengoutput data 
// pada tiap class, dan untuk class BasePlusCommissionEmployee akan ditambahkan proses untuk mengalikan 
// gaji pokok dengan persentase komisinya. Dan pada output terakhir terdapat bagian yang menampilkan data 
// dari class Employee dan ditambahkan keterangan darimana data tersebut diperoleh.

public class Main {
        public static void main(String[] args) {
            // no.3
            // 3.	Buat objek dari method Employee? Jelaskan hasil dari output program tersebut!
            // Jawaban: Setelah membuat objek Employee pada class main, tidak ada perubahan pada output,
            //  dan pada penambahan objek Employee juga harus melakukan override, hal  ini dilakukan karena
            //  terdapat method abstract earnings() pada class Employee.
            // Employee employ = new Employee("Elvira", "1234") {
            //         // override
            //         public double earnings() {
            //                 return 0;
            //         };
            // };

            // no.4
            // 4.	Tambahkan atribut tanggal lahir di Kelas Employee, serta tambahkan method pendukungnya 
            // (accesor dan mutator). Modifikasi program agar sesuai. Asumsikan gaji yang diterima adalah per bulan,
            //  buat kelas uji untuk menguji program yang sudah anda modifikasi, kemudian buat objek dari semua class 
            // (salariedEmployee, hourlyEmployee, commissionEmployee, basePlusCommissionEmployee dan hitung gajinya secara polimorfisme, 
            // serta tambahkan gajinya sebesar 100.000 jika bulan ini adalah bulan ulang tahunnya.
            //  Jawab: Untuk menjawab soal ini, ditambahkan atribut tanggalLahir dan tanggalSekarang
            // menggunakan objek LocalDate pada class Employee dan pada constructor ditambahkan
            // parameter LocalDate tanggalLahir yang akan menjadi tanggal lahir tiap pekerja dan juga
            // LocalDate tanggalSekarang diinisiasi menggunakan method LocalDate.now() untuk
            // mendapatkan tanggal hari ini. Kemudian pada tiap tiap class turunan Employee akan
            // ditambahkan variabel LocalDate tanggalLahir pada constructor dan ditambahkan if-else pada
            // method yang akan menghitung total gaji. Apabila bulan dari tanggalLahir sama dengan bulan
        // Syntax
        //   System.out.println("Tanggal Hari Ini: " + LocalDate.now() + "\n");
        //   SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, LocalDate.of(2000, 5, 8));
        //   HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, LocalDate.of(1998, 3, 4));
        //   CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06, LocalDate.of(2003, 4, 23));
        //   BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000, .04, 300, LocalDate.of(2002, 8, 2));
        //   System.out.println("Employees diproses secara terpisah:\n");
        //   System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan: ", salariedEmployee.earnings());
        //   System.out.printf("%s\n%s: $%,.2f\n\n", hourlyEmployee, "pendapatan: ", hourlyEmployee.earnings());
        //   System.out.printf("%s\n%s: $%,.2f\n\n", commissionEmployee, "pendapatan: ",
        //                   commissionEmployee.earnings());
        //   System.out.printf("%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned ",
        //                   basePlusCommissionEmployee.earnings());
        //   Employee[] employees = new Employee[4];
        //   employees[0] = salariedEmployee;
        //   employees[1] = hourlyEmployee;
        //   employees[2] = commissionEmployee;
        //   employees[3] = basePlusCommissionEmployee;
        //   System.out.println("Employees diproses secara polimorfisme:\n");
        //   for (Employee currentEmployee : employees) {
        //           System.out.println(currentEmployee);
        //           if (currentEmployee instanceof BasePlusCommissionEmployee) {
        //                   BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
        //                   employee.setBaseSalary(1.10 * employee.getBaseSalary());
        //                   System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n",
        //                                   employee.getBaseSalary());
        //           }
        //           System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        //   }
        //   for (int j = 0; j < employees.length; j++) {
        //           System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        //   }
        // }

        // no.5
        // Membuat kelas uji dengan kriteria baru employee yaitu menggaaji berdasarkan jumlah produksi yang dihasilkan
        // a. analisis
        // b. implementasi
        // Jawab:
        ProductionEmployee pe1 = new ProductionEmployee("Elvira", "654", 100, 5000, LocalDate.of(1999, 12, 15));
        ProductionEmployee pe2 = new ProductionEmployee("Rosa", "899", 10, 5000, LocalDate.of(2002, 10, 9));
        ProductionEmployee pe3 = new ProductionEmployee("Khoir", "243", 50, 5000, LocalDate.of(2001, 9, 2));
        ProductionEmployee pe4 = new ProductionEmployee("Nisa", "564", 120, 5000, LocalDate.of(2000, 5, 8));

        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", pe1, "earned ", pe1.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", pe2, "earned ", pe2.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", pe3, "earned ", pe3.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n", pe4, "earned ", pe4.earnings());

        Employee[] employees = new Employee[4];
        employees[0] = pe1;
        employees[1] = pe2;
        employees[2] = pe3;
        employees[3] = pe4;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
        }

        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
        }
    }
}
