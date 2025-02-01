package Service;



public class SpotifyService {
    private final String BASE_AUTH_URL = "https://accounts.spotify.com/authorize";
    private final String redirectedURI;
    private  final String clientID;
    private boolean authenticated = false;

    public SpotifyService(String redirectedURI, String clientID){
                this.redirectedURI = redirectedURI;
                this.clientID = clientID;
    }

    public void authenticate(){
        String responseLink = String.format("%s?client_id=%s&redirect_uri=%s&response_type=code",
                BASE_AUTH_URL, clientID, redirectedURI);
        System.out.println(responseLink);

        authenticated = true;
        System.out.println("---SUCCESS---");
    }
    public boolean isAuthenticated(){
        return authenticated;
    }

    public void getNewReleases() {
        if (!authenticated) {
            System.out.println("Please, provide access for application.");
            return;
        }
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    public void getFeaturedPlaylists() {
        if (!authenticated) {
            System.out.println("Please, provide access for application.");
            return;
        }
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }

    public void getCategories() {
        if (!authenticated) {
            System.out.println("Please, provide access for application.");
            return;
        }
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    public void getPlaylists(String category) {
        if (!authenticated) {
            System.out.println("Please, provide access for application.");
            return;
        }
        System.out.printf("---%s PLAYLISTS---\n", category.toUpperCase());
        switch (category.toLowerCase()) {
            case "mood":
                System.out.println("Walk Like A Badass");
                System.out.println("Rage Beats");
                System.out.println("Arab Mood Booster");
                System.out.println("Sunday Stroll");
                break;
            default:
                System.out.println("No playlists available for this category.");
        }
    }

}
