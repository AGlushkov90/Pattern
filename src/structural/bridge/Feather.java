package structural.bridge;

public class Feather implements Device {
    Profession profession;

    public Feather(Profession profession) {
        this.profession = profession;
    }

    @Override
    public void enterDevice() {
        System.out.println("Enter feather");
        profession.writeText();
    }
}
