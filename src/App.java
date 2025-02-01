import Service.CommandHandler;
import Service.SpotifyService;
import Service.UserInput;
import commands.*;

public class App {

    private final CommandHandler commandHandler;
    private final UserInput userInput;

    public App(String redirectedURI, String clientID){
        SpotifyService spotifyService = new SpotifyService(redirectedURI, clientID);
        commandHandler = new CommandHandler();
        userInput = new UserInput();

        commandHandler.register("auth", new AuthCommand(spotifyService));
        commandHandler.register("new", new NewCommand(spotifyService));
        commandHandler.register("featured", new FeaturedCommand(spotifyService));
        commandHandler.register("categories", new CategoriesCommand(spotifyService));
        commandHandler.register("playlists", new PlaylistsCommand(spotifyService));
        commandHandler.register("exit", new ExitCommand());
    }
    public void start() {
        while (true) {
            String input = userInput.getInput();
            commandHandler.execute(input);
        }
    }
}
