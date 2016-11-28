package data_structure.src.recursion;

/**
 * 汉诺塔问题
 * 描述：X,Y,Z三个塔座，初始X上有n个盘子，将其移动到Z上并保证刚开始的顺序。
 * Created by jinxufei on 2016/11/28.
 */
public class Hanoi {

    public void hanio(int n,char x,char y,char z){
        if (n==1) move(x,n,z);
        else{
            hanio(n-1,x,z,y);
            move(x,n,z);
            hanio(n-1,y,x,z);
        }

    }
    private void move(char x,int n,char y){
        System.out.println("Move"+n+"from"+x+"to"+y);
    }

    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        hanoi.hanio(3,'x','y','z');
    }
}
