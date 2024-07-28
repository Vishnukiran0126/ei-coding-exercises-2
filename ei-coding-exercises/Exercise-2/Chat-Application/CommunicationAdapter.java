// CommunicationAdapter interface
interface CommunicationAdapter {
    void send(String message);
    String receive();
}

// WebSocketAdapter implementing CommunicationAdapter
class WebSocketAdapter implements CommunicationAdapter {
    // Simulated WebSocket communication methods
    public void send(String message) {
        System.out.println("Sending via WebSocket: " + message);
    }

    public String receive() {
        return "Received via WebSocket";
    }
}

// HTTPAdapter implementing CommunicationAdapter
class HTTPAdapter implements CommunicationAdapter {
    // Simulated HTTP communication methods
    public void send(String message) {
        System.out.println("Sending via HTTP: " + message);
    }

    public String receive() {
        return "Received via HTTP";
    }
}
