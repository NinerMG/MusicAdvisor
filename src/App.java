public class App {

    UserInput userInput;
    AppResponse appResponse;
    public App(String RedirectedURI, String ClientID){
        userInput = new UserInput();
        appResponse = new AppResponse(RedirectedURI, ClientID);
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            String input = userInput.getInput();
            flag = appResponse.responseHandling(input);
        }
    }
}
