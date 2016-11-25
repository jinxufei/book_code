package data_structure.src.recursion;

/**
 * Created by jinxufei on 2016/11/25.
 * n的阶乘
 */
public class RecursionTest {
    private int n;
    public int recursion(int n){
        if (n==0){
            return 1;
        }
        else
        return n*recursion(n-1);
    }

    public static void main(String[] args) {
        RecursionTest recursionTest = new RecursionTest();
        int result =recursionTest.recursion(6);
        System.out.print(result);
    }
}
