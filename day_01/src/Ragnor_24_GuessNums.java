/*
story:程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
当猜错的时候根据不同的情况给出响应的提示
case1：如果猜的数字比真实数字大，提示你猜的数据大了
case2：如果猜的数字比真实数字小，提示你猜的数据小了
case3：如果猜的数字和真实数字相等，提示恭喜你猜中了
*/

import java.util.Scanner;
import java.util.Random;


public class Ragnor_24_GuessNums{
	public static void main(String[] args){
		Random r = new Random();
		int random_num = r.nextInt(101);

		Scanner rc = new Scanner(System.in);

		/*三个死循环示例*/
		
		// for(;;){
		// 	int input_num = rc.nextInt();
		// 	if (input_num > random_num){
		// 			System.out.println("guess num is bigger than random num!");
		// 		}else if (input_num < random_num){
		// 			System.out.println("guess num is thinner than random num!");
		// 		}else if (input_num == random_num){
		// 			System.out.println("guess num is equal to random num! you win the price!");
					// break;
		// 		}else{
		// 			System.out.println("only support int number input!");
		// 		}
		// }

		// while(true){
		// 	int input_num = rc.nextInt();
		// 	if (input_num > random_num){
		// 			System.out.println("guess num is bigger than random num!");
		// 		}else if (input_num < random_num){
		// 			System.out.println("guess num is thinner than random num!");
		// 		}else if (input_num == random_num){
		// 			System.out.println("guess num is equal to random num! you win the price!");
					// break;
		// 		}else{
		// 			System.out.println("only support int number input!");
		// 		}

		// }

		do {
			int input_num = rc.nextInt();
			if (input_num > random_num){
					System.out.println("guess num is bigger than random num!");
				}else if (input_num < random_num){
					System.out.println("guess num is thinner than random num!");
				}else if (input_num == random_num){
					System.out.println("guess num is equal to random num! you win the price!");
					break;
				}else{
					System.out.println("only support int number input!");
				}
			}while(true);


		// 不能用switch，而且不能这些写， 错误示范
		// switch(random_num){
		// 	case input_num > random_num:{
		// 		System.out.println("guess num is bigger than random num!");
		// 	}
		// 	case (input_num < random_num):{
		// 		System.out.println("guess num is thinner than random num!");
		// 	}
		// 	case (input_num == random_num):{
		// 		System.out.println("guess num is equal to random num! you win the price!");
		// 	}

		// }
	}
}