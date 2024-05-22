// package TugasPraktikum;

// public class Main {
//     public static void main(String[] args) {
//         Invoice[] invoices1 = {
//                 new Invoice("Laptop", 1, 1000),
//                 new Invoice("Mouse", 2, 50)
//         };

//         Invoice[] invoices2 = {
//                 new Invoice("Book", 3, 15),
//                 new Invoice("Pen", 10, 2)
//         };

//         PermanentEmployee permEmployee = new PermanentEmployee(101, "Yana", 3000, invoices1, "Manager");
//         InternEmployee internEmployee = new InternEmployee(102, "Budi", 1000, invoices2, 6);

//         System.out.println("Permanent Employee:");
//         permEmployee.work();
//         permEmployee.annualReview();
//         permEmployee.promote();
//         permEmployee.employeeDetails();
//         Employee.companyPolicy();
//         System.out.println("Salary after deductions: " + permEmployee.getPayableAmount());

//         System.out.println("\nIntern Employee:");
//         internEmployee.work();
//         internEmployee.attendTrainingSession();
//         internEmployee.trackContractDuration();
//         internEmployee.extendContract(3);
//         internEmployee.completeInternship();
//         internEmployee.employeeDetails();
//         Employee.companyPolicy();
//         System.out.println("Salary after deductions: " + internEmployee.getPayableAmount());
//     }
// }

package TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        Invoice[] invoicePerm = {
                new Invoice("Laptop", 1, 1000),
                new Invoice("Mouse", 2, 50)
        };

        Invoice[] invoiceIntern = {
                new Invoice("Book", 3, 15),
                new Invoice("Pen", 10, 2)
        };

        PermanentEmployee permEmployee = new PermanentEmployee(101, "Yana", 3000, invoicePerm, "Manager");
        InternEmployee internEmployee = new InternEmployee(102, "Budi", 1000, invoiceIntern, 6);

        System.out.println("Permanent Employee:");
        permEmployee.work();
        permEmployee.ulasanTahunan();
        permEmployee.promote();
        permEmployee.employeeDetails();
        Employee.companyPolicy();
        System.out.println("Gaji setelah dipotong: $" + permEmployee.getPayableAmount());

        System.out.println("\nIntern Employee:");
        internEmployee.work();
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();
        internEmployee.extendContract(3);
        internEmployee.completeInternship();
        internEmployee.employeeDetails();
        Employee.companyPolicy();
        System.out.println("Gaji setelah dipotong: $" + internEmployee.getPayableAmount());
    }
}
