/*
* story:直接在控制台打印出1-100之间满足逢七必过的规则的数据，方便大家玩那个逢七必过游戏的时候方便说过
*
* realize: 1-100之间就是循环喽，遇到七或者七的倍数就打印出来
*
* function：
*   1、返回值
*   2、参数
* */

public class Ragnor_01_SevenPass {
    public static void main(String[] args) {
        sevenPass();
    }

    public static void sevenPass(){

        for (int i = 1; i < 101; i++){
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7){
                System.out.println(i);
            }
        }
    }
}


