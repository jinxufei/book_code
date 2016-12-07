package data_structure.src.graph.exception;

/**
 * Created by jinxufei on 2016/12/6.
 */
public class UnsuppotedOperation extends Exception {
    private String msg;

    public UnsuppotedOperation(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "UnsuppotedOperation{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
