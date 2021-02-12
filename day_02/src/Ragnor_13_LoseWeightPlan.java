import java.util.Scanner;

/*
* story:减肥计划
* 需求：输入星期数，显示今天的减肥活动
* 周一：跑步
* 周二：游泳
* 周三：慢走
* 周四：动感单车
* 周五：拳击
* 周六：爬山
* 周日：吃一顿好的
* */
public class Ragnor_13_LoseWeightPlan {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            loseWeight(choice);
        }

    }

    public static void loseWeight(int choice){
        switch (choice){
            case 1:
                System.out.println("周一：跑步");
                break;
            case 2:
                System.out.println("周二：游泳");
                break;
            case 3:
                System.out.println("周三：慢走");
                break;
            case 4:
                System.out.println("周四：动感单车");
                break;
            case 5:
                System.out.println("周五：拳击");
                break;
            case 6:
                System.out.println("周六：爬山");
                break;
            case 7:
                System.out.println("周日：吃一顿好的");
                break;
            default:
                System.out.println("瞎输出！");
                break;

        }
    }
}
