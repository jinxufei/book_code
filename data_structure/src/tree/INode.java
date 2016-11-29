package data_structure.src.tree;

/**
 * some method are provided by Node class
 * Created by jinxufei on 2016/11/29.
 */
public interface INode {
    //判断是否有父节点
    boolean hasParent();
    //判断是否有左孩子
    boolean hasLeftChild();
    //判断是否有右孩子
    boolean hasRightChild();
    //是否有叶子节点
    boolean isLeaf();
    //是否是左孩子
    boolean isLeftChild();
    //是否是右孩子
    boolean isRightChild();
}
