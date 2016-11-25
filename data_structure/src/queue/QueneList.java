package data_structure.src.queue;

import data_structure.src.queue.exception.QueueEmptyException;

import java.io.Serializable;

/**
 * Created by jinxufei on 2016/11/25.
 */
public class QueneList implements Queue,Serializable {

    private int size;

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enqueue(Object o) {

    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        return null;
    }

    @Override
    public Object peek() throws QueueEmptyException {
        return null;
    }
}
