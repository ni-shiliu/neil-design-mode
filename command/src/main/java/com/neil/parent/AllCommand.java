package com.neil.parent;

/**
 * @author nihao
 * @date 2023/5/30
 */
public class AllCommand implements Command {
    Command[] commands;

    public AllCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {

    }
}
