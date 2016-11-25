package data_structure.src.queue.exception;

/**
 * Created by jinxufei on 2016/11/25.
 */
public class QueueEmptyException extends Exception{

    private String message;

    public QueueEmptyException(String message) {
        super(message);
    }


    @Override
    public String toString() {
        return "QueueEmptyException{" +
                "message='" + message + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
