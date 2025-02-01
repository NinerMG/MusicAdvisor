package commands;

import Service.SpotifyService;

public class PlaylistsCommand implements Command{

    private final SpotifyService spotifyService;

    public PlaylistsCommand(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public void execute(String category) {
        spotifyService.getPlaylists(category);
    }
}

