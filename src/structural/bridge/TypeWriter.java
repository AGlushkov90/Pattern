package structural.bridge;

public class TypeWriter implements Device {
    Profession profession;

    public TypeWriter(Profession profession) {
        this.profession = profession;
    }

    @Override
    public void enterDevice() {
        System.out.println("Enter typewriter");
        profession.writeText();
    }
}
