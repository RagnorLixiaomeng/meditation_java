/*
story:小明快要进行期末考试了，小明对爸爸说，会根据他不同的考试成绩，送他不同的礼物，假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台进行输出
*/
import java.util.Scanner;

public class Ragnor_10_ExamReword{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if (score < 60){
			System.out.println("reword: hit head");
		}else if (60 <= score && score < 80){
			System.out.println("reword: buy a motorcycle");
		}else if (80 <= score && score <= 100){
			System.out.println("reword: see a movie");
		}else{
			System.out.println("wrong score input!");
		}
	}
}