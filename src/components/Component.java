package components;

import mediator.Mediator;

public interface Component {

    /**
     * Define the mediator
     * 
     * @param mediator
     */
    void setMediator(Mediator mediator);

    /**
     * The name is used by the mediator
     * 
     * @return name of the component
     */
    String getName();
}
