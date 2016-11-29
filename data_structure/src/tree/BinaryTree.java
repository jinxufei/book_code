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
