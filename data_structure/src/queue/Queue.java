package data_structure.src.queue;

import data_structure.src.queue.exception.QueueEmptyException;

/**
 * Created by jinxufei on 2016/11/25.
 */
public interface Queue {
    int getSize();
    boolean isEmpty();
    void enqueue(Object o);
    Object dequeue() throws QueueEmptyException;
    Object peek() throws QueueEmptyException;
}
