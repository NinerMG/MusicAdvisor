package Service;

import commands.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandHandler {

    private final Map<String, Command> commands = new HashMap<>();

    public void register(String name, Command command){
        commands.put(name.toLowerCase(), command);
    }

    public void execute(String input){
        String[] parts = input.split(" ", 2);
        String commandName = parts[0].toLowerCase();
        String args = parts.length > 1 ? parts[1] : "";

        Command command = commands.get(commandName);
        if (command != null){
            command.execute(args);
        } else {
            System.out.println("Unknown command. Please try again.");
        }
    }
}
