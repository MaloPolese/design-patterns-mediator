package mediator;

import commands.Command;
import components.Component;

public interface Mediator {

    /**
     * Execute a command
     * 
     * @param command
     */
    void executeCommand(Command command);

    /**
     * Undo the last command
     */
    void undo();

    /**
     * Init component in the mediator.
     * 
     * @param component
     */
    void registerComponent(Component component);

    /**
     * Change the content of the undo button with the text of the textfield
     */
    void textChange();

    /**
     * Generate all ui Add all element to the panel
     */
    void createGUI();
}
