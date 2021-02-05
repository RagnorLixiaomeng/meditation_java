/*
在控制台中输出一天的小时和分钟：
	一天24小时
	 一小时60分钟

*/

public class Ragnor_22_NestedCycleGrammar{
	public static void main(String[] args){
		for (int hour = 0; hour <= 24; hour++){
			for (int minute = 0; minute <= 60; minute++){
				System.out.println("now time is " + hour + "点"+ minute + "分");
			}
		}
	}
}