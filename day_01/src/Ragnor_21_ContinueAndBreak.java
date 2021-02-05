/*
contine and break in cycle grammar

*/

public class Ragnor_21_ContinueAndBreak{
	public static void main(String[] args){
		for (int i = 1; i <= 5; i++){
			if (i % 2 == 0){
				continue;
				// break;
			}
			System.out.println(i);
		}
	}
}