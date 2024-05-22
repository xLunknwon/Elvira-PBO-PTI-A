package TugasPraktikum;

public class PermanentEmployee extends Employee {
    private String position;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String position) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.position = position;
    }

    @Override
    public void work() {
        System.out.println("Permanent employee " + getName() + " bekerja sebagai " + position);
    }

    public void ulasanTahunan() {
        System.out.println("Ulasan tahunan Permanent Employee " + getName());
    }

    public void promote() {
        System.out.println("Promosi permanent employee " + getName());
    }
}

