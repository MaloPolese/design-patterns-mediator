package commands;

import java.awt.Color;

import javax.swing.JPanel;

public class YellowCommand extends Command {

    public YellowCommand(JPanel _receiver) {
        super(_receiver);
    }

    @Override
    public boolean execute() {
        this.backup();
        this.receiver.setBackground(Color.YELLOW);
        return true;
    }

}
