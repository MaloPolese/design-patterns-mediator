package commands;

import java.awt.Color;

import javax.swing.JPanel;

public class RedCommand extends Command {

    public RedCommand(JPanel _receiver) {
        super(_receiver);
    }

    @Override
    public boolean execute() {
        this.backup();
        this.receiver.setBackground(Color.RED);
        return true;
    }

}
