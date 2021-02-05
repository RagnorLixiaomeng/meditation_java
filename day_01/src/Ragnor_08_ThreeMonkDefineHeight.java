/*
story:一座寺庙里面住着三个和尚，已知他们的身高分别是xcm、ycm、zcm,请用程序实现获取这三个和尚的最高身高
*/
import java.util.Scanner;

public class Ragnor_08_ThreeMonkDefineHeight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("monk1 height:");
		int monke1_height = sc.nextInt();
		System.out.println("monk2 height:");
		int monke2_height = sc.nextInt();
		System.out.println("monk3 height:");
		int monke3_height = sc.nextInt();

		int temp_height = (monke1_height > monke2_height) ? monke1_height : monke2_height;
		int heightest_monk = (monke3_height > temp_height) ? monke3_height: temp_height;

		System.out.println("the heightest monk height is:" + heightest_monk);

	}
}