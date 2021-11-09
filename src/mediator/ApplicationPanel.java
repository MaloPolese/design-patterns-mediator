package mediator;

import javax.swing.JPanel;

import commands.Command;
import commands.CommandHistory;
import components.Button;
import components.Component;
import components.TextField;
import components.UndoButton;

public class ApplicationPanel implements Mediator {

    private JPanel panel;

    private CommandHistory history = new CommandHistory();

    private Button redButton;
    private Button blueButton;
    private Button yellowButton;
    private UndoButton undoButton;
    private TextField textField;

    public ApplicationPanel(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
        case "Red":
            this.redButton = (Button) component;
            break;
        case "Blue":
            // TODO
            break;
        case "Yellow":
            // TODO
            break;
        case "Undo":
            // TODO
            break;
        case "TextField":
            // TODO
            break;
        }
    }

    @Override
    public void createGUI() {
        this.panel.add(redButton);
        // TODO
        // TODO
        // TODO
        // TODO
    }

    @Override
    public void undo() {
        if (history.isEmpty())
            return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }

    @Override
    public void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    @Override
    public void textChange() {
        String text = this.textField.getText();
        if (text.length() > 0) {
            this.undoButton.setText(text);
        }
    }
}
