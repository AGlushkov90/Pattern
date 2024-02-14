package behaivoral.template_method;

public class Main {
    public static void main(String[] args) {
        Network twitter = new Twitter();
        Network vk = new VK();
        twitter.doPost();
        vk.doPost();
    }
}
