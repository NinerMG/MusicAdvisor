package commands;

public class ExitCommand implements Command{
    @Override
    public void execute(String args) {
        System.out.println("---GOODBYE!---");
        System.exit(0);
    }
}
