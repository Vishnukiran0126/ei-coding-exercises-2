public class User {
    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void joinChatRoom(ChatRoom chatRoom) {
        if (this.chatRoom != null) {
            this.chatRoom.leave(this);
        }
        this.chatRoom = chatRoom;
        chatRoom.join(this);
    }

    public void leaveChatRoom() {
        if (chatRoom != null) {
            chatRoom.leave(this);
            chatRoom = null;
        }
    }

    public void sendMessage(String message) {
        if (chatRoom != null) {
            chatRoom.sendMessage(this, message);
        }
    }

    public void update(String message) {
        System.out.println("[" + name + "] " + message);
    }
}
