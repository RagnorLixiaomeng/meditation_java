/*
story:一座寺庙里面住着三个和尚，已知他们的身高分别是150cm、210cm、165cm,请用程序实现获取这三个和尚的最高身高
*/

public class Ragnor_06_ThreeMonk{
	public static void main(String[] args){
		int monk1_height = 150;
		int monk2_height = 210;
		int monk3_height = 165;

		int result_between_2 = (monk1_height > monk2_height) ? monk1_height : monk2_height;
		int result_finally = (result_between_2 > monk3_height) ? result_between_2 : monk3_height;

		System.out.println(result_finally);
	}
}