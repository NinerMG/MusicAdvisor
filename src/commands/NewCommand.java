package commands;

import Service.SpotifyService;

public class NewCommand implements Command{
    private final SpotifyService spotifyService;

    public NewCommand(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public void execute(String args) {
        spotifyService.getNewReleases();
    }
}
