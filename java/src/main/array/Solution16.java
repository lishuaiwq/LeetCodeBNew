package main.array;

/**
 * 构建乘积数组
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 * （注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * 对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。
 *
 * 简单理解：
 * B[5] = A[0] * A[1] * A[2] * A[3] * A[4] * A[6] * A[7] * A[8] // 没有自己而已
 */
public class Solution16 {
    public int[] multiply(int[] A) {
         int[] array = new int[A.length];
         for(int i= 0 ;i < A.length ; i++){
             int sum = 1;
             for(int j = 0; j < A.length ; j++){
                 if(i == j){
                     continue;
                 }
                 sum = sum * A[j];
             }
             array[i] = sum;
         }
return array;
    }
}
