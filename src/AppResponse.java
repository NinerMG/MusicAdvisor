public class AppResponse {

    public boolean responseHandling(String query){
        boolean flag = true;

        switch (query.split(" ")[0].toLowerCase()){
            case "new":
                handleNew();
                break;
            case "featured":
                handleFeatured();
                break;
            case "categories":
                handleCategories();
                break;
            case "playlists":
                    String category = query.substring(10);
                    handlePlaylists(category);
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

}
