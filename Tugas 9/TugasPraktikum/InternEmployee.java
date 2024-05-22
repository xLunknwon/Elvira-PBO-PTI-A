package TugasPraktikum;

public class InternEmployee extends Employee implements Contract {
    private int contractDuration; // in months

    public InternEmployee(int noReg, String name, int salaryPerMonth, Invoice[] invoices, int contractDuration) {
        super(noReg, name, salaryPerMonth, invoices);
        this.contractDuration = contractDuration;
    }

    @Override
    public void work() {
        System.out.println("Intern " + getName() + " sedang mengerjakan projek.");
    }

    @Override
    public int getContractDuration() {
        return contractDuration;
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Intern " + getName() + " menghadiri sesi pelatihan.");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Intern " + getName() + " mempunyai " + contractDuration + " bulan tersisa di kontrak mereka.");
    }

    public void extendContract(int months) {
        contractDuration += months;
        System.out.println("Intern " + getName() + " kontrknya diperpanjang selama " + months + " bulan.");
    }

    public void completeInternship() {
        System.out.println("Intern " + getName() + " telah menyelesaikan internshipnya.");
    }
}
