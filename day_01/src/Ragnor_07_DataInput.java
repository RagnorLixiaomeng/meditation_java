/*
实现数据的键盘输入
*/
import java.util.Scanner;

public class Ragnor_07_DataInput{
	public static void main(String[] args){
		// step1: 创建对象
		Scanner sc = new Scanner(System.in);
		// step2: 接收数据
		int i = sc.nextInt();

		System.out.println(i);

	}
}