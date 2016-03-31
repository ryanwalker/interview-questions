package factory;

/**
 * A message that gets sent to an end user of the software application.
 */
public interface Message {

    /**
     * @return - the message's body
     */
    String getMessageBody();

    /**
     * Set the message's body, which is the message that a user would see.
     * @param messageBody - the body of the message
     */
    void setMessageBody(String messageBody);

    /**
     * @return - the type of message this is, e.g. text, sms, email, etc.
     */
    String getMessageType();

    /**
     * @param adress - the address to send to
     * @return - a message with the following format
     * Sending the following {message type here} to {address here}:\n{message body here}
     */
    String send(String adress);

}
