package behaivoral.mediator;

public class Main {
    public static void main(String[] args) {
        CommonChat commonChat = new CommonChat();
        User admin = new Admin("Admin", commonChat);
        User guest = new Guest("guest", commonChat);
        User guest1 = new Guest("guest1", commonChat);
        commonChat.addUser(admin);
        commonChat.addUser(guest);
        commonChat.addUser(guest1);
        admin.sendMessage("i am here");
        guest.sendMessage("hello");
        guest1.sendMessage("hi");
    }
}
