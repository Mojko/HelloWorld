
public class HelloWorldException extends Exception {
    public HelloWorldException() {}

    // Constructor that accepts a message
    public HelloWorldException(String message)
    {
       super(message);
    }
}
