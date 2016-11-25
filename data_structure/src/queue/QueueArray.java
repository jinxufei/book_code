package data_structure.src.queue;

import data_structure.src.queue.exception.QueueEmptyException;

/**
 * Created by jinxufei on 2016/11/25.
 * this queue base on Array,it's just a simple queue,the other queue by Array is round-robin queue
 */
public class QueueArray implements Queue{

    private int size;
    private static int DEFAULT_SIZE = 10;
    private Object[] objects;

    public QueueArray(int size, Object[] objects) {
        this.size = DEFAULT_SIZE;
        this.objects = new Object[DEFAULT_SIZE];
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
        if (getSize()<=objects.length) expandSpace();
        objects[size] = o;
        size++;
    }

    private void expandSpace(){
        Object a[] = new Object[objects.length*2];
        for (int i=0;i<objects.length;i++){
            a[i] = objects[i];
        }
        objects = a;
    }

    @Override
    public Object dequeue() throws QueueEmptyException {
        if (size<=0) throw new QueueEmptyException("隊列中沒元素");
        Object o = objects[size];
        objects[size--] = null;
        return o;
    }

    @Override
    public Object peek() throws QueueEmptyException {
        if (size<=0) throw new QueueEmptyException("队列中没元素");
        return objects[size];
    }

}
