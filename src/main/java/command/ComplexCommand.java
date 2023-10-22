package command;


import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand {
    private final List<DriverCommand> commands;

    public ComplexCommand() {
        commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (DriverCommand command : commands) {
            command.execute();
        }
    }

    public void addCommand(DriverCommand command) {
        commands.add(command);
    }

    public void addCommands(List<DriverCommand> commands) {
        this.commands.addAll(commands);
    }
}
