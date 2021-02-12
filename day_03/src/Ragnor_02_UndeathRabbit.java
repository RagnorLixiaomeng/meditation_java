/*
* story:有一对兔子，从出生后第3个月起，每个月都生一对小兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第二十个
* 月的兔子对数为多少？
* */


public class Ragnor_02_UndeathRabbit {
    public static void main(String[] args) {
        undeathRabbit();
    }

    // 函数：
    // 输入的是： int 类型的 月数
    // 输出的是： int 类型的 对数

    public static void undeathRabbit(){
//        Array rabbit = new Array(month);
        int [] rabbit = new int [20];

        rabbit[0] = 1;
        rabbit[1] = 1;

        for (int x = 2; x < rabbit.length; x++) {
            rabbit[x] = rabbit[x - 2] + rabbit[x - 1];
        }

//        System.out.println(rabbit[month]);
        System.out.println(rabbit[19]);

    }
}
