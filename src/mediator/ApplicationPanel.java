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
            this.blueButton = (Button) component;
            break;
        case "Yellow":
            this.yellowButton = (Button) component;
            break;
        case "Undo":
            this.undoButton = (UndoButton) component;
            break;
        case "TextField":
            this.textField = (TextField) component;
            break;
        }
    }

    @Override
    public void createGUI() {
        this.panel.add(redButton);
        this.panel.add(blueButton);
        this.panel.add(yellowButton);
        this.panel.add(undoButton);
        this.panel.add(textField);
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
