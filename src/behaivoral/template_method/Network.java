package behaivoral.template_method;

public abstract class Network {
    public void doPost() {
        login();
        System.out.println("do post");
        exit();
    }

    protected abstract void exit();

    protected abstract void login();
}
