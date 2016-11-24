package data_structure.src.LineList.ArrayList;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyArrayList extends AbstractList implements List, Serializable {

    private final int DEFAULT_LEN = 10;
    private int size;
    private Object[] objects;

    public MyArrayList() {
        objects = new Object[DEFAULT_LEN];
    }

    public MyArrayList(int size) {
        objects = new Object[size];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object e : objects) {
            if (e.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        if(index > size || index <0){
            throw new ArrayIndexOutOfBoundsException("越界");
        }
        return objects[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        if(size >= objects.length){
            //// TODO: 2016/11/24
            Object[] a = new Object[objects.length*2];
            for (int j  = size;j>index;j--){
                a[j] = objects[index];
                objects[index] = element ;
            }
        }
        for (int i = index ;i > index; i--){
            objects[i] =  objects[i-1];
            objects[index] = element;
        }
        return;
    }

    @Override
    public Object remove(int index) {
        if (index<0 || index>size){
            throw new ArrayIndexOutOfBoundsException("越界");
        }
        Object o = objects[index];
        for (int i = index;i < size;i++){
            objects[i] = objects[i+1];
        }
        objects[--size] = null;
        return o;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(objects[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        Iterator i = null;
        for (i = c.iterator();i.hasNext();i.next()){
            i.remove();
        }
        if (c.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
