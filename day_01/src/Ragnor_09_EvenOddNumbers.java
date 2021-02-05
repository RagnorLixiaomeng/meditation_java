/*
story:任意给出一个整数，请用程序实现判断该整数是奇数还是偶数，并在控制台输出该整数是奇数还是偶数
*/
import java.util.Scanner;

public class Ragnor_09_EvenOddNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		if (number % 2 == 0){
			System.out.println("this number is Even number 偶数" + number);
		}else if(number % 2 != 0){
			System.out.println("this number is Odd number 奇数" + number);
		}
	}
}