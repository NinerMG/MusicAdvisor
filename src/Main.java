public class Main {
    public static void main(String[] args) {
        //custom app data to authentication on Spotify
        String RedirectedURI = "http://localhost:8080";

        //for security this String on public github is empty
        String ClientID = "";


        App app = new App(RedirectedURI, ClientID);
        app.start();
    }
}