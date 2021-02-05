/*
while 语法格式

基本格式：
	while (条件语句){
		循环体语句；
	}

完整格式：
	初始化语句;
	while(条件判断语句){
		循环体语句；
		条件判断语句；
	}

执行流程：
	1、执行初始化语句
	2、执行条件判断语句，看结果是true还是false
	   如果是false，循环结束
	   如果是true，继续执行
	3、执行循环体语句
	4、执行条件控制语句
	5、回到2继续
*/

public class Ragnor_18_WhileGrammar{
	public static void main(String[] args){
		int j = 1;
		while(j <= 5){
			System.out.print(" this is java while grammar!");
			j++;
		}
	}
}