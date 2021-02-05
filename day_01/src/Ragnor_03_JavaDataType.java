/*java 是一门强类型语言：不同的数据类型大小是不一样的*/
public class Ragnor_03_JavaDataType{
	public static void main(String[] args){
		System.out.println("java数据类型：基本数据类型-数值型1：整数之byte 取值范围-2的7次方 到 2的7次方减1");
		System.out.println(-128);

		System.out.println("java数据类型：基本数据类型-数值型1：整数之short 取值范围-2的15次方 到 2的15次方减1");
		System.out.println(-32768);

		System.out.println("java数据类型：基本的数据类型-数值型1：整数之int 取值范围是-2的31次方 到 2的31次方减1");
		System.out.println(327677);

		System.out.println("java数据类型：基本的数据类型-数值型1：整数之long(L) 取值范围是-2的63次方 到 2的63次方减1");
		System.out.println(-3276888888L);
		System.out.println();

		System.out.println("java数据类型：基本数据类型-数值型2：浮点数之float(F) 取值范围(-3.4E+38 到 -1.4E-45) (1.4E-45 到 3.4E+38)");
		System.out.println(1.234F);

		System.out.println("java数据类型：基本数据类型-数值型2：浮点数之float(F) 取值范围(-1.7E+308 到 -4.9E-324) (4.9E-324 到 1.7E+308)");
		System.out.println(12345678.23443412);
		System.out.println();

		System.out.println("java数据类型：基本数据类型-数值型3：字符char 取值范围0-65535");
		System.out.println('A' + 'a');
		System.out.println();


		System.out.println("----------------------------------------------------------");
		System.out.println("java数据类型：基本数据类型-非数值型4：布尔量 取值范围： true false");
		System.out.println(true);


		System.out.println("----------------------------------------------------------");
		System.out.println("java数据类型：引用数据类型1：类 class");
		System.out.println("java数据类型：引用数据类型2：接口 interface");
		System.out.println("java数据类型：引用数据类型3：数组 []");


	}
}