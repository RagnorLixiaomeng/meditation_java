/*方法参数的传递：引用类型 对于引用类型的参数，形式参数的改变，影响实际参数的值*/

// 因为引用数据类型中的值都保存在堆内存中，两个函数都是指向这块堆内存地址所以会变

public class Ragnor_10_FuncParaTransQuoteType {
    public static void main(String[] args) {
        int [] arr = new int []{1, 2, 3};
        System.out.println("调用change方法之前" + arr[0]);
        change(arr);
        System.out.println("调用change方法之后" + arr[0]);

    }

    public static void change(int [] arr2){
        arr2[0] = 111;
    }
}
