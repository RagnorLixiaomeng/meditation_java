/* java 中方法的重载
* 1、多个方法在同一个类中
* 2、多个方法具有相同的方法名
* 3、多个方法的参数不相同，类型不同或者数量不同
* 4、与返回值无关，在调用的时候java虚拟机会通过参数的不同来区分同名的方法
* */

public class Ragnor_07_MethodReloadGrammar {
    public static void main(String[] args) {
        int result1 = sumNums(1, 2);
        System.out.println(result1);

        double result2 = sumNums(1.1, 2.2);
        System.out.println(result2);

        int result3 = sumNums(1, 2, 3);
        System.out.println(result3);

    }
    //story1: 求两个int类型数据和的方法
    public static int sumNums(int a, int b){
        return a + b;
    }
    //story2: 求两个double类型数据和的方法
    public static double sumNums(double a, double b){
        return a + b;
    }
    //story3: 求三个int类型数据和的方法
    public static int sumNums(int a, int b, int c){
        return a + b + c;
    }
}
