/*
story:统计水仙花的个数
*/

public class Ragnor_17_CountWaterFlower{
	public static void main(String[] args){	
		int count = 0;

		for (int i =100; i <= 999; i++){
			int digit_num = i % 10;
			int tens_digit_num = (i / 10) % 10;;
			int hundreds_digit_num = ((i / 10) / 10) % 10;
			if (digit_num * digit_num * digit_num + tens_digit_num * tens_digit_num * tens_digit_num + hundreds_digit_num * hundreds_digit_num * hundreds_digit_num == i){
			System.out.println("this num is WaterFlower num：" + i);
			count += 1;
		}
		}
		System.out.println("水仙花数的个数是："  + count);
	}

}