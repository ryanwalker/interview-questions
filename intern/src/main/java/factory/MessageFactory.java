package factory;

/**
 * A factory for creating Messages
 */
public abstract class MessageFactory {

    /**
     * @return - returns a Message
     */
    Message initializeMessage() {
        System.out.println("Using " + this.getClass().getSimpleName() + " to create this message...\n");
        return createMessage();
    }

    /**
     * Creates the message that will be returned in initializeMessage()
     * @return - the newly created message
     */
    abstract Message createMessage();

}
