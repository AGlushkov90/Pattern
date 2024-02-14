package behaivoral.mediator;

import java.util.ArrayList;
import java.util.List;

public class CommonChat implements Chat {
    private final List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User currentUser : userList) {
            if (!currentUser.equals(user)) {
                currentUser.getMessage(message);
            }
        }
    }
}
