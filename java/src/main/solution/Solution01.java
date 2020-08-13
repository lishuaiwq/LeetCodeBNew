package main.solution;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Solution01 {


    private static boolean Find(int target, int[][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int x = array[0].length -1;
        int yMax = array.length -1;

        int y = 0;

        while (x >= 0 && y <= yMax){
            int key = array[y][x];
            if(key == target){
                return true;
            }else if(key > target){
                x--;
            }else{
                y++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2}};
        System.out.println(Find(1,array));
    }
}
