package data_structure.src.queue;

import data_structure.src.queue.exception.QueueEmptyException;

import java.io.Serializable;

/**
 * Created by jinxufei on 2016/11/25.
 */
public class QueneList implements Queue,Serializable {

    private int size;
    private QueneNode front;
    private QueneNode rear;

    public QueneList(int size, QueneNode front, QueneNode rear) {
        this.size = 0;
        front = new QueneNode();
        rear = front;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void enqueue(Object o) {
        QueneNode queneNode = new QueneNode(null,o);
        rear.next = queneNode;
        rear = queneNode;
        size++;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("队列为空");
        Object o = front.getObject();
        front = front.next;
        size--;
        if (isEmpty()){
            rear = front;
        }
        return o;
    }

    @Override
    public Object peek() throws QueueEmptyException {
        if (isEmpty()) throw new QueueEmptyException("队列为空");
        return front.getNext().getObject();
    }

    private static class QueneNode{
        private QueneNode next;
        private Object object;

        public QueneNode(QueneNode next, Object object) {
            this.next = next;
            this.object = object;
        }

        public QueneNode() {
        }

        @Override
        public String toString() {
            return "QueneNode{" +
                    "next=" + next +
                    ", object=" + object +
                    '}';
        }

        public QueneNode getNext() {
            return next;
        }

        public void setNext(QueneNode next) {
            this.next = next;
        }

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }
    }
}
