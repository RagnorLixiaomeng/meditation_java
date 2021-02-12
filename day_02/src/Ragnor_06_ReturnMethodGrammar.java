/* 带参数 带返回值的方法*/
/*定义一个方法，该方法接收一个参数，判断该参数是否是偶数，并返回其真假值*/

public class Ragnor_06_ReturnMethodGrammar {
    public static void main(String[] args) {
        boolean result = isEvenNum(10);
        System.out.println(result);
    }

    public static boolean isEvenNum(int a){
        if (a % 2 == 0){
//            System.out.println(a + "is even num");
            return true;
        }else {
//            System.out.println(a + "is odd num");
            return false;
        }
    }
}
