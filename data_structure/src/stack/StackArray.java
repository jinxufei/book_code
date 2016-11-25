package data_structure.src.stack;

import data_structure.src.stack.exception.StackEmptyException;

import java.io.Serializable;

/**
 * Created by jinxufei on 2016/11/25.
 * implement by Array
 */
public class StackArray implements Stack,Serializable{

    private int size = 0;
    private static int DEFAULT_SIZE = 10;
    private Object[] objects;

    public StackArray(int size, Object[] objects) {
        this.size = size;
        this.objects = new Object[DEFAULT_SIZE];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0? true:false;
    }


    @Override
    public void push(Object o) {
        if(getSize()>=objects.length) expandSpace();
        objects[size++] = o;
    }

    private void expandSpace(){
        Object[] a =  new Object[objects.length*2];
        for (int i = 0;i<objects.length;i++){
            a[i] = objects[i];
        }
        objects = a;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (size<=0) throw new StackEmptyException("棧中沒元素");
        Object o = objects[size];
        objects[size--] = null;
        return o;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if (size<=0) throw new StackEmptyException("棧中沒元素");
        return objects[size];
    }
}
