package exception;

public class AlreadyExistsException extends Exception {

    Object o;
    public AlreadyExistsException(Object o, String message) {
        super(message);
        this.o = o;
    }

    public AlreadyExistsException(Object o) {
        this(o, "An error occured while creating the task");
    }
}
