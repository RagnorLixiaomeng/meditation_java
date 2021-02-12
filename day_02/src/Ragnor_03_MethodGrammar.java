/*story:定义一个方法，在方法中定义一个变量，判断该数据是否是偶数*/

import java.util.Scanner;

public class Ragnor_03_MethodGrammar {
    public static void main(String[] args) {
        isEvenNum();  //main是程序执行的主入口，在这里调用我们定义的函数
        getMaxNum();
    }
    // 1、定义一个方法
    public static void isEvenNum(){
        int num = 10;
        if (num % 2 == 0){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }

    public static void getMaxNum(){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("num1 is bigger than num2");
        }else if (num1 < num2){
            System.out.println("num1 is thinner than num2");
        }else {
            System.out.println("num1 is equal to num2");
        }
    }
}
