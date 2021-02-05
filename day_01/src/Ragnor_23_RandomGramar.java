/* 
java内置的生成随机数模块
*/
import java.util.Random;

public class Ragnor_23_RandomGramar{
	public static void main(String[] args){
		// 创建对象
		Random r = new Random();
		// 获取随机数
		int num = r.nextInt(10);

		// int num = r.nextInt(10);  // 不明白为什么这个不行，不能重复定义变量，但是在下面for循环中却可以 明白了==》并没有定义两个int num2，没有出{}

		System.out.println(num);

		System.out.println("*********************");



		// 获取 0-100之间的随机数 ==》取头不取尾

		for (int i = 0; i < 100; i++){
			int num2 = r.nextInt(101);
			System.out.println(num2);

		}

	}
}