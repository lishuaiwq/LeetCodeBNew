package main.sort;

public class InsertSort {
    // 直接插入排序，升序排序,稳定排序，时间复杂度最好是O(N)，最差的情况是O(N^2)
    static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int end = i - 1;
            //给key找一个合适的位置进行插入
            while (end >= 0 && key < array[end]) {
                array[end + 1] = array[end];
                end--;
            }
            array[end + 1] = key;
        }
    }
    // 除此之外还有升级版的二分查找。
    // 希尔排序

    public static void main(String[] args) {
        int [] array = {7,3,4,2,8,4,1,0};
        insertSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
