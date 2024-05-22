package TugasPraktikum;

public abstract class Employee implements Payable {
    private int noReg;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int noReg, String name, int salaryPerMonth, Invoice[] invoices) {
        this.noReg = noReg;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getnoReg() {
        return noReg;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public abstract void work();

    public static void companyPolicy() {
        System.out.println("Kebijakan perusahaan: Semua karyawan harus mematuhi kode etik.");
    }

    public void employeeDetails() {
        System.out.println("Employee Details: " + name + "\nRegistration Number: " + noReg);
    }
}

