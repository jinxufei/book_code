package data_structure.src.tree;

import java.util.Iterator;

/**
 * Created by jinxufei on 2016/11/28.
 * This class is Binary Tree ,and it's implements by list
 */
public class BinaryTree implements Tree{

    private int height;
    private int size;
    private Node node;

    Node parent = null;
    public BinaryTree(Node n){
        node.setObject(n.getObject());
        height = 0;
        size = 1;
        node.setParentNode(null);
        node.setLeftNode(null);
        node.setRightNode(null);
    }


    @Override
    public int getSize() {
        return size;
    }

    public void updateSize(){
 /*       node = getRoot(node);
        int size = 1;
        if (node.hasLeftChild()){
            size++;
            node = node.getLeftNode();
        }
        node = getRoot(node);
        if (node.hasRightChild()){
            size++;
            node = node.getRightNode();
        }*/
        size = 1;
        if (node.hasLeftChild()) {
            size += size;
            node = node.getLeftNode();
        }
        if (node.hasRightChild()){
            size += size;
            node = node.getRightNode();
        }
        if (node.hasParent()){
            updateSize();
        }
    }
    @Override
    public Node getRoot(Node n) {
        if (node.hasParent()){
            node = node.getParentNode();
            parent = getRoot(node);
        }
        return parent;
    }

    @Override
    public Node getParent() {
        if (node.hasParent()){
            return node.getParentNode();
        }
        return null;
    }
    /**break connection with this node's parent*/
    public void breakParent(){
        if (!node.hasParent()) return;
        if (node.isLeftChild()) node.getParentNode().setLeftNode(null);
        if (node.isRightChild())node.getParentNode().setRightNode(null);
        updateSize();
        updateHeight();
    }
    @Override
    public Node getFirstChild() {
        return null;
    }

    @Override
    public Node getNextSibling(Node node) {
        return null;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void updateHeight(){
        int h = 0;
        if (node.hasLeftChild()){
            Math.max(h,height);
        }
        if (node.hasRightChild()){
            Math.max(h,height);
        }
        height = h;
        if(node.hasParent())
            updateHeight();

    }
    @Override
    public void insertChild(Node node, Node child) {

    }

    @Override
    public void deleteChild(Node node, int i) {

    }

    @Override
    public Iterator preOrder(Node node) {
        return null;
    }

    @Override
    public Iterator postOrder(Node node) {
        return null;
    }

    @Override
    public Iterator levelOrder(Node node) {
        return null;
    }

}
