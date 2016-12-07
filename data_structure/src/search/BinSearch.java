package data_structure.src.search;

/**
 * Created by jinxufei on 2016/12/7.
 */
public class BinSearch {


    public int binSearch(int a[],int key,int low, int hign){
        if (low == hign){
            if (a[low] == key){
                return low;
            }else {
                return -1;
            }
        }
        while (low<=hign) {
            int mid = (low + hign)/2-1;
            if (a[mid]==key){
                return mid;
            }
            if(a[mid]<key){
                hign = mid -1;
                System.out.println("<<<<<<<<<<"+mid);
            }else {
                hign = mid -1;
                System.out.println(">>>>>>>>>>"+mid);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,4,6,14,24,56,57,76,78,87,92,123,241,351,356,521};
        BinSearch binSearch = new BinSearch();
        int index = binSearch.binSearch(a,1,0,a.length);
        System.out.println("------------"+index);
    }
}
