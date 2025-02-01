package commands;

import Service.SpotifyService;

public class CategoriesCommand implements Command{

    private final SpotifyService spotifyService;

    public CategoriesCommand(SpotifyService spotifyService) {
        this.spotifyService = spotifyService;
    }

    @Override
    public void execute(String args) {
        spotifyService.getCategories();
    }
}
