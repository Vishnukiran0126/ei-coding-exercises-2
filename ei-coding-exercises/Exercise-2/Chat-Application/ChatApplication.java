public class ChatApplication {
    public static void main(String[] args) {
        ChatRoomManager manager = ChatRoomManager.getInstance();
        
        // Create chat rooms
        ChatRoom room1 = new ChatRoom("Room123");
        ChatRoom room2 = new ChatRoom("Room456");
        
        manager.addChatRoom(room1);
        manager.addChatRoom(room2);

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Users join chat rooms
        alice.joinChatRoom(room1);
        bob.joinChatRoom(room1);
        charlie.joinChatRoom(room2);

        // Users send messages
        alice.sendMessage("Hello, everyone!");
        bob.sendMessage("How's it going?");
        charlie.sendMessage("Hi, anyone here?");

        // Demonstrate Adapter Pattern
        CommunicationAdapter webSocketAdapter = new WebSocketAdapter();
        webSocketAdapter.send("This is a WebSocket message.");
        System.out.println(webSocketAdapter.receive());

        CommunicationAdapter httpAdapter = new HTTPAdapter();
        httpAdapter.send("This is an HTTP message.");
        System.out.println(httpAdapter.receive());
    }
}
