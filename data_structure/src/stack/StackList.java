package data_structure.src.stack;

import data_structure.src.stack.exception.StackEmptyException;

/**
 * Created by Administrator on 2016/11/25.
 * implement by list
 */
public class StackList implements Stack {

    private NodeStack top;
    private int size;

    public StackList(NodeStack top, int size) {
        this.top = null;
        this.size = 0;
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
    public void push(Object o) {
        NodeStack nodeStack = new NodeStack(top,o);
        top = nodeStack;
        size++;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (size<=0){
            throw new StackEmptyException("棧沒有元素");
        }
        Object o = top.getObject();
        top = top.getNext();
        size -- ;
        return o;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if(size<=0){
            throw new StackEmptyException("棧中沒元素");
        }
        return top.getObject();
    }

    private static class NodeStack{
        private NodeStack next;
        private Object object;

        public NodeStack(NodeStack next, Object object) {
            this.next = next;
            this.object = object;
        }

        @Override
        public String toString() {
            return "NodeStack{" +
                    "next=" + next +
                    ", object=" + object +
                    '}';
        }

        public Object getObject() {
            return object;
        }

        public NodeStack getNext() {
            return next;
        }
    }
}
