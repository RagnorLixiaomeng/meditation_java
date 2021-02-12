/*使用逐项对比的方法确认：最大的数值*/

public class Ragnor_02_GetMaxNum {
    public static void main(String[] args) {
        int [] arr = new int[]{12, 45, 98, 73, 60};
        int max_num = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (max_num < arr[i]){
                max_num = arr[i];
            }
        }
        System.out.println("the max num in arr is:" + max_num);
    }
}
