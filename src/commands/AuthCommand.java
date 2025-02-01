package commands;

import Service.SpotifyService;

public class AuthCommand implements Command {
    private final SpotifyService spotifyService;

    public AuthCommand(SpotifyService spotifyService){
        this.spotifyService = spotifyService;
    }

    @Override
    public void execute(String args) {
        spotifyService.authenticate();
    }
}
