package structural.composite;

public class Doctor implements Author {
    @Override
    public void write() {
        System.out.println("write recipe");
    }
}
