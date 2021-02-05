/*
switch结构
*/
import java.util.Scanner;

public class Ragnor_11_SwitchGrammar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		switch(week){
			case 1:
				System.out.print("Monday");
				break;
			case 2:
				System.out.print("Tuesday");
				break;  // 如果这里不写break就会造成case穿透，在不判断下一个case值的情况下，向下运行，直到遇到break，或者整体switch语句结束
			case 3:
				System.out.print("wednesday");
				break;
			case 4:
				System.out.print("Thursday");
				break;
			case 5:
				System.out.print("Friday");
				break;
			case 6:
				System.out.print("Saturday");
				break;
			case 7:
				System.out.print("Sunday");
				break;
			default:
				System.out.print("wrong day");
				break;
		}
	} 
}