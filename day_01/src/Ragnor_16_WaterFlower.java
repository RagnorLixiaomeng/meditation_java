/*
story:在控制台输出所有的水仙花数：水仙花数：三位数字构成 且 个位的立方 + 十位数字的立方 + 百位数字的立方 等于源数字

realize:这里里面涉及到一个算法：取任意数字位上的值：1、取个位：% 10取余数就行 2、取十位：/ 10 在 %10取余数即可 3、取百位 /10 /10 再%10取余数即可
*/

public class Ragnor_16_WaterFlower{
	public static void main(String[] args){		

		for (int i =100; i <= 999; i++){
			int digit_num = i % 10;
			int tens_digit_num = (i / 10) % 10;;
			int hundreds_digit_num = ((i / 10) / 10) % 10;
			if (digit_num * digit_num * digit_num + tens_digit_num * tens_digit_num * tens_digit_num + hundreds_digit_num * hundreds_digit_num * hundreds_digit_num == i){
			System.out.println("this num is WaterFlower num：" + i);
		}
		}
	}

}