package data_structure.src.tree;

import java.util.Iterator;

/**
 * Created by jinxufei on 2016/11/28.
 */
public interface Tree {

    int getSize();
    Node getRoot(Node node);
    Node getParent();
    Node getFirstChild();
    Node getNextSibling(Node node);
    int getHeight();
    void setLeftChild(Node node);
    void setRightChild(Node node);
    void insertChild(Node node,Node nodex);
    void insertLeftChild(Node node);
    void insertRightChild(Node node);
    void deleteChild(Node node,int i);

    Iterator preOrder(Node node);
    Iterator postOrder(Node node);
    Iterator levelOrder(Node node);
}
