package behaivoral.template_method;

public class Twitter extends Network {
    @Override
    protected void exit() {
        System.out.println("exit twitter");
    }

    @Override
    protected void login() {
        System.out.println("login twitter");
    }
}
