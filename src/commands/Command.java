package commands;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class Command {
    public JPanel receiver;
    private Color backup;

    Command(JPanel _receiver) {
        this.receiver = _receiver;
    }

    /**
     * Create a backup of the current background color
     */
    void backup() {
        backup = receiver.getBackground();
    }

    /**
     * Set background color width the backup
     */
    public void undo() {
        receiver.setBackground(backup);
    }

    /**
     * Execure the command logic
     * 
     * @return true if we want to save the command in history
     */
    public abstract boolean execute();
}