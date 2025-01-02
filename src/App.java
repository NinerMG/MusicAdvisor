public class App {

    UserInput userInput;
    AppResponse appResponse;
    public App(){
        userInput = new UserInput();
        appResponse = new AppResponse();
    }

    public void start() {
        boolean flag = true;
        while (flag) {
            String input = userInput.getInput();
            flag = appResponse.responseHandling(input);
        }
    }
}
