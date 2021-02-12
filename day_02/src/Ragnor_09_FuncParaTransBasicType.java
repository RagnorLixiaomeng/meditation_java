/*方法参数的传递：对于基本数据类型的修改，形式参数的改变，不影响实际参数的值==》100就是那个基本数据类型 vs 引用数据类型*/

// 因为 number 跟 a都在自己的栈内存中，不一样的

public class Ragnor_09_FuncParaTransBasicType {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前" + number);
        change(number);
        System.out.println("调用change方法后" + number);
    }

    public static void change(int a){
        a = 200;
    }
}
