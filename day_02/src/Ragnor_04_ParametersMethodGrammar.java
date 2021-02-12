/* 定义带参数的java方法语法以及调用*/
/* story:定义一个方法，该方法接收一个参数，判断该参数是否是偶数*/

public class Ragnor_04_ParametersMethodGrammar {
    public static void main(String[] args) {
        isEvenNum(7);
    }

    public static void isEvenNum(int a){
        if (a % 2 == 0){
            System.out.println("this num is even num!");
        }else {
            System.out.println("this num is odd num!");
        }
    }
}
