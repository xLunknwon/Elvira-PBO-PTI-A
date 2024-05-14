package AnalisisPercobaan;
public class HeroMagic extends Hero {
    private String power;

    public HeroMagic(String nama, double health){
        super(nama, health);
        this.power = "Magic";
    }

    public String getPower(){
        return power;
    }
    public void display() {
        System.out.println(this.getName() + " is a " +
                this.power + " Hero.");
    }

}
