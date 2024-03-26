
public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    public static int jmlObjek = 0;

    public Student() {
        name = "";
        address = "";
        age = 0;
        jmlObjek++;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    public Student(String name, String address, int age, double math, double english, double science) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = math;
        this.englishGrade = english;
        this.scienceGrade = science;
    }

    public boolean statusAkhir(){
        double average = getAverage();
        return average >= 61;
    }

    public static void jmlObjek() {
        System.out.println("Jumlah objek yang telah dibuat adalah " + jmlObjek);
        System.out.println("=================================================");
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("berstatus akhir " + (statusAkhir() ? "Lolos" : "Remidi"));
    }
}