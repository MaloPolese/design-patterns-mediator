package components;

import javax.swing.JButton;

import commands.Command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mediator.Mediator;

/**
 * Generic button to execute commands
 */
public class Button extends JButton implements Component, ActionListener {

    Mediator mediator;
    Command command;

    public Button(String _name) {
        super(_name);
        this.addActionListener(this);
    }

    /**
     * Allows you to define the mediator object. This is the object that will be in
     * charge of executing the command
     */
    @Override
    public void setMediator(Mediator mediator) {
        // TODO
    }

    /**
     * Define the command
     * 
     * @param command The command performed
     */
    public void setCommand(Command command) {
        // TODO
    }

    /**
     * Return the name of the button The name is used by the mediator to identify
     * the different components
     */
    public String getName() {
        return this.getText();
    }

    /**
     * The method is executed at each click of the button. The method executed a
     * command through the mediator.
     * 
     * @param e ( not use in this lab )
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO
    }

}
