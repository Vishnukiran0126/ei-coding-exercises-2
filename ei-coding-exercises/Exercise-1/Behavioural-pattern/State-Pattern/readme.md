# Media Player State Pattern Demo

This demonstrates the use of the State Pattern in Java to manage the state transitions of a media player. The media player can be in different states: playing, paused, or stopped, and the behavior of the player changes based on its current state.

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

