# ei-coding-exercises-2
#Exercise-1
#Behavioural pattern
# Media Player State Pattern Demo

This  demonstrates the use of the State Pattern in Java to manage the state transitions of a media player. The media player can be in different states: playing, paused, or stopped, and the behavior of the player changes based on its current state.

## Features

- **Play:** Start or resume playback.
- **Pause:** Pause the playback if currently playing.
- **Stop:** Stop the playback.

## Design Pattern Used

**State Pattern:** Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Classes

### State Interface

- **State:** Defines an interface for encapsulating the behavior associated with a particular state of the Context.

### Concrete State Classes

- **PlayingState:** Implements the behavior for the "playing" state.
- **PausedState:** Implements the behavior for the "paused" state.
- **StoppedState:** Implements the behavior for the "stopped" state.

### Context Class

- **MediaPlayerContext:** Maintains an instance of a ConcreteState subclass that defines the current state.

## Files

1. **State.java:** The State interface.
2. **PlayingState.java:** The concrete state class for playing state.
3. **PausedState.java:** The concrete state class for paused state.
4. **StoppedState.java:** The concrete state class for stopped state.
5. **MediaPlayerContext.java:** The context class managing state transitions.
6. **StatePatternDemo.java:** The main class demonstrating the state transitions.











































#Exercise-2

# Simple Real-Time Chat Application

This is a simple real-time chat application implemented in Java. The application allows users to join different chat rooms or create their own chat rooms. Users can send and receive messages in real-time within a chat room.

## Features

1. **Create/Join Chat Rooms:** Users can create or join chat rooms by entering a unique room ID.
2. **Send/Receive Messages:** Users can send and receive messages in real-time within a chat room.
3. **Active Users List:** Displays a list of active users in the chat room.
4. **Communication Protocols:** Uses the Adapter Pattern to work with different communication protocols (WebSocket, HTTP, etc.).

## Design Patterns Used

1. **Behavioral Pattern: Observer Pattern** - Used to notify clients of new messages or user activities.
2. **Creational Pattern: Singleton Pattern** - Used to manage the state of the chat rooms.
3. **Structural Pattern: Adapter Pattern** - Used to allow the system to work with different types of client communication protocols.

## Classes

### Singleton Pattern

- **ChatRoomManager:** Manages chat rooms and ensures there's only one instance of it.

### Observer Pattern

- **ChatRoom:** Represents each chat room and notifies users of new messages.
- **User:** Represents each user and implements the observer pattern to receive updates.

### Adapter Pattern

- **CommunicationAdapter:** Interface for different communication protocols.
- **WebSocketAdapter:** Implements CommunicationAdapter for WebSocket communication.
- **HTTPAdapter:** Implements CommunicationAdapter for HTTP communication.
    ```

## Example Usage

```sh
# Create chat rooms
ChatRoom room1 = new ChatRoom("Room123");
ChatRoom room2 = new ChatRoom("Room456");

# Add chat rooms to the manager
ChatRoomManager manager = ChatRoomManager.getInstance();
manager.addChatRoom(room1);
manager.addChatRoom(room2);

# Create users
User alice = new User("Alice");
User bob = new User("Bob");
User charlie = new User("Charlie");

# Users join chat rooms
alice.joinChatRoom(room1);
bob.joinChatRoom(room1);
charlie.joinChatRoom(room2);

# Users send messages
alice.sendMessage("Hello, everyone!");
bob.sendMessage("How's it going?");
charlie.sendMessage("Hi, anyone here?");
