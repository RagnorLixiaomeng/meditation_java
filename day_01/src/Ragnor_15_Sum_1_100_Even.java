/*story：求1 - 100之间的偶数的和*/

public class Ragnor_15_Sum_1_100_Even{
	public static void main(String[] args){
		int result = 0;
		for (int i = 1; i <= 100; i++){
			if (i % 2 == 0){
				result += i;
			}
		}
		System.out.println(result);
	}
}

