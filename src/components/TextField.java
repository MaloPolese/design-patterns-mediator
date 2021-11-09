package components;

import javax.swing.JTextField;

import mediator.Mediator;

import java.awt.Dimension;
import java.awt.event.KeyEvent;

/**
 * Displays an input field and changes the text of the undoButton.
 */
public class TextField extends JTextField implements Component {

    Mediator mediator;
    String name;

    public TextField(String _name) {
        super("Ecrit ici");
        this.setPreferredSize(new Dimension(200, 50));
        this.name = _name;
    }

    /**
     * Allows you to define the mediator object. This is the object that will be in
     * charge of executing the command
     */
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Return the name of the button The name is used by the mediator to identify
     * the different components
     */
    public String getName() {
        return this.name;

    }

    /**
     * The method is called each time the content of the textField changes
     * 
     * @param keyEvent ( not use in this lab )
     */
    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.textChange();
    }

}
