public class AppResponse {
    private boolean authenticated = false;
    private String RedirectedURI;
    private String ClientID;

    public AppResponse(String RedirectedURI, String ClientID){
        this.RedirectedURI = RedirectedURI;
        this.ClientID = ClientID;
    }

    public boolean responseHandling(String query){
        boolean flag = true;

        switch (query.split(" ")[0].toLowerCase()){
            case "auth":
                handleAuthentication();
                break;
            case "new":
                if (!isAuthenticated()){
                    System.out.println("Please, provide access for application.");
                } else
                handleNew();
                break;
            case "featured":
                if (!isAuthenticated()){
                    System.out.println("Please, provide access for application.");
                } else
                handleFeatured();
                break;
            case "categories":
                if (!isAuthenticated()){
                    System.out.println("Please, provide access for application.");
                } else
                handleCategories();
                break;
            case "playlists":
                if (!isAuthenticated()){
                    System.out.println("Please, provide access for application.");
                } else {
                    String category = query.substring(10);
                    handlePlaylists(category);
                }
                break;
            case "exit":
                System.out.println("---GOODBYE!---");
                flag = false;
                break;
            default:
                System.out.println("Unknown command. Please try again.");
                break;
        }
        return flag;
    }

    private void handleNew(){
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }
    private void handleFeatured(){
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }
    private void handleCategories(){
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    private void handlePlaylists(String category){
        System.out.printf("---%s PLAYLISTS---\n", category.toUpperCase());

        switch (category.toLowerCase()){
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

    private boolean isAuthenticated(){
        return authenticated;
    }
    private void setAuthenticated(boolean authenticated){
        this.authenticated = authenticated;
    }

    private void handleAuthentication(){
        String baseUrl = "https://accounts.spotify.com/authorize";
        String responseType = "code";
        String responseLink = String.format("%s?client_id=%s&redirect_uri=%s&response_type=%s",
                baseUrl, ClientID, RedirectedURI, responseType);
        System.out.println(responseLink);
        if (responseLink.equals("https://accounts.spotify.com/authorize?client_id=866b195e523f4a77b7d4a484ff436cd0&redirect_uri=http://localhost:8080&response_type=code")){
            System.out.println("---SUCCESS---");
        }
        setAuthenticated(true);
    }
}
