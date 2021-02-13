/*
* story:有这样一个数组，元素是（68，27，95，88，171，996，51，210）,
* 求出该数组中满足要求的元素和，要求是：求和的元素个位数和十位数都不能是7，并且只能是偶数
*
* 个位数：  ！= 7  num % 10 != 7
* 十位数：  ！= 7
* 偶数：    % 2 == 0
*
* */

public class Ragnor_04_ArrayElementSum {
    public static void main(String[] args) {
        System.out.println(arrayElementSum());

    }

    public static int arrayElementSum(){
        int [] arr = new int[]{68, 27, 95, 88, 171, 996, 51, 210};
        int result = 0;
        for (int x=0; x< arr.length; x++){
            if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0){
                result += arr[x];
            }
        }
        return result;
    }
}
