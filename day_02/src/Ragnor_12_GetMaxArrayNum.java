/*story：设计一个方法用于获取数组中元素的最大值，调用方法并输出结果*/

public class Ragnor_12_GetMaxArrayNum {
    public static void main(String[] args) {
        int [] arr = new int[] {3, 5, 9, 66};
        System.out.println("the max num in array is:" + getMaxArrayNum(arr));
    }

    public static int getMaxArrayNum(int [] arr){
        int max_num = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max_num < arr[i]){
                max_num = arr[i];
            }
        }
        return max_num;
    }

}
