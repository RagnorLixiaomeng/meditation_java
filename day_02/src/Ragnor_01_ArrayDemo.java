/*
数组：一种用于存储多个相同类型数据的存储模型
* */

public class Ragnor_01_ArrayDemo {
    public static void main(String[] args) {
        int [] arr = new int[3];
        /*
        * 左边：
        *   int:说明数组中的元素类型是int类型
        *   []:说明这是一个数组
        *   arr:说明数组的名字是arr
        *   new:为数组申请内存空间
        *   int:说明数组中的元素类型是int类型
        *   []:说明这是一个数组
        *   3:数组的长度，其实就是元素的个数
        * */

        // 输出数组名==》申请的内存地址
        System.out.println(arr); // [I@5cad8086

        // 输出数组中的元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 给数组中的元素赋值
        arr[0] = 100;
        arr[2] = 300;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // 静态定义数组并遍历
        int [] arr2 = new int[]{1, 2, 3};
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }


    }

}
