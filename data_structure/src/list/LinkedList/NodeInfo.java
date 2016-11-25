package data_structure.src.list.LinkedList;

/**
 * Created by jinxufei on 2016/11/24.
 * this implement is change to inner static class
 */
public class NodeInfo<E> implements INode {

    private Object object;
    private NodeInfo next;

    public NodeInfo() {
        this(null,null);
    }

    public NodeInfo(Object object, NodeInfo next) {
        this.object = object;
        this.next = next;
    }

    @Override
    public Object getData() {
        return object;
    }

    @Override
    public void setData(Object o) {
        object = o;
    }
}
