package data_structure.src.tree;

/**
 * Created by jinxufei on 2016/12/5.
 */
public class Huffman extends BinaryTree {
    private int weight;//权值
    private String coding=""; //编码

    public Huffman(Node n,int weight) {
        super(n);
        this.weight = weight;
    }

    public Huffman(Node n, int weight, String coding) {
        super(n);
        this.weight = weight;
        this.coding = coding;
    }


}
