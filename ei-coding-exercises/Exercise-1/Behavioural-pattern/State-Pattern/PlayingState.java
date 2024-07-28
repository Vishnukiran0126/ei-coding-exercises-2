class PlayingState implements State {
    @Override
    public void play(MediaPlayerContext context) {
        System.out.println("Already playing");
    }

    @Override
    public void pause(MediaPlayerContext context) {
        System.out.println("Pausing playback");
        context.setState(new PausedState());
    }

    @Override
    public void stop(MediaPlayerContext context) {
        System.out.println("Stopping playback");
        context.setState(new StoppedState());
    }
}
