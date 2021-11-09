package commands;

import java.awt.Color;

import javax.swing.JPanel;

public class BlueCommand extends Command {

    public BlueCommand(JPanel _receiver) {
        super(_receiver);
    }

    @Override
    public boolean execute() {
        this.backup();
        this.receiver.setBackground(Color.BLUE);
        return true;
    }

}
