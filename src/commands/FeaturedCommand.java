package commands;

import Service.SpotifyService;

public class FeaturedCommand implements Command{

    private final SpotifyService spotifyService;

    public FeaturedCommand(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public void execute(String args) {
        spotifyService.getFeaturedPlaylists();
    }
}
