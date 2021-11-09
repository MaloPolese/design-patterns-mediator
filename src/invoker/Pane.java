package invoker;

import javax.swing.JPanel;

import commands.BlueCommand;
import commands.RedCommand;
import commands.YellowCommand;
import components.Button;
import components.TextField;
import components.UndoButton;
import mediator.ApplicationPanel;
import mediator.Mediator;

/**
 * Content pane of the application.
 */
public class Pane extends JPanel {

    public Pane() {
        // Init mediator
        Mediator mediator = // TODO

        // Init components
        Button redButton = new Button("Red");
        Button blueButton = new Button("Blue");
        Button yellowButton = new Button("Yellow");
        UndoButton undoButton = new UndoButton("Undo");
        TextField textField = new TextField("TextField");

        // Set commands
        redButton.setCommand(new RedCommand(this));
        // TODO
        // TODO

        // Register components
        mediator.registerComponent(redButton);
        // TODO
        // TODO
        // TODO
        // TODO

        // Create UI
        // TODO
    }
}
