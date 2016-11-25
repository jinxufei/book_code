package data_structure.src.stack.exception;

/**
 * Created by Administrator on 2016/11/25.
 */
public class StackEmptyException extends Exception{

    private String message;

    public StackEmptyException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "StackEmptyException{" +
                "message='" + message + '\'' +
                '}';
    }
}
