public class StatePatternDemo {
    public static void main(String[] args) {
        MediaPlayerContext player = new MediaPlayerContext();

        player.play();  // Starting playback
        player.pause(); // Pausing playback
        player.play();  // Resuming playback
        player.stop();  // Stopping playback
        player.pause(); // Cannot pause, playback is stopped
    }
}
