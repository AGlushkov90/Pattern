package behaivoral.template_method;

public class VK extends Network {
    @Override
    protected void exit() {
        System.out.println("exit VK");
    }

    @Override
    protected void login() {
        System.out.println("login VK");
    }
}
