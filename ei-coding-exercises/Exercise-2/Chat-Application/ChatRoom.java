import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<User> users;
    private List<String> messages;

    public ChatRoom(String roomId) {
        this.roomId = roomId;
        this.users = new ArrayList<>();
        this.messages = new ArrayList<>();
    }

    public String getRoomId() {
        return roomId;
    }

    public void join(User user) {
        users.add(user);
        notifyUsers(user.getName() + " has joined the room.");
    }

    public void leave(User user) {
        users.remove(user);
        notifyUsers(user.getName() + " has left the room.");
    }

    public void sendMessage(User user, String message) {
        String formattedMessage = user.getName() + ": " + message;
        messages.add(formattedMessage);
        notifyUsers(formattedMessage);
    }

    private void notifyUsers(String message) {
        for (User user : users) {
            user.update(message);
        }
    }

    public List<String> getMessages() {
        return messages;
    }
}
