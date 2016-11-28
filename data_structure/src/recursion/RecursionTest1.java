package data_structure.src.recursion;

/**
 * X的n次幂
 * Created by jinxufei on 2016/11/28.
 */
public class RecursionTest1 {

    public int test1(int x,int n){
        int y;
        if (n == 0){
            y = 1;
        }else {
            y = test1(x,n/2);
            y = y*y;
            if (n%2==1) y = y*x;
        }

        return y;
    }
    public static void main(String[] args) {
        RecursionTest1 recursionTest1 = new RecursionTest1();
        System.out.println("result = "+recursionTest1.test1(6,6));
    }
}
