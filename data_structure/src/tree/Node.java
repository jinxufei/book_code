package data_structure.src.tree;

import java.io.Serializable;

/**
 * Created by jinxufei on 2016/11/29.
 */
public class Node implements Serializable,INode {

    private Object object;
    private Node leftNode;
    private Node rightNode;
    private Node parentNode;

    public Node(Object object, Node leftNode, Node rightNode, Node parentNode) {
        this.object = object;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.parentNode = parentNode;
    }

    public Node() {
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }


    @Override
    public boolean hasParent() {
        return parentNode!=null;
    }

    @Override
    public boolean hasLeftChild() {
        return leftNode!=null;
    }

    @Override
    public boolean hasRightChild() {
        return rightNode!=null;
    }

    @Override
    public boolean isLeaf() {
        return !hasParent()&&!hasRightChild();
    }


    @Override
    public String toString() {
        return "Node{" +
                "object=" + object +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", parentNode=" + parentNode +
                '}';
    }
}
