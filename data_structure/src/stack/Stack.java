package data_structure.src.stack;

import data_structure.src.stack.exception.StackEmptyException;

/**
 * Created by jinxufei on 2016/11/25.
 */
public interface Stack {

    int getSize();
    boolean isEmpty();
    void push(Object o);
    Object pop()throws StackEmptyException;
    Object peek()throws StackEmptyException;
}
