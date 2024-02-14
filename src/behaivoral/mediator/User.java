package behaivoral.mediator;

public abstract class User {
    protected String name;
    protected Chat chat;

    public User(String name, Chat chat) {
        this.name = name;
        this.chat = chat;
    }

    protected abstract void getMessage(String message);

    protected void sendMessage(String message) {
        chat.sendMessage(message, this);
    }
}
