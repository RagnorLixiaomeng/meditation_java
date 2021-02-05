/*
story：世界上最高的山峰珠穆朗玛峰：8844.43米， 假如我有一张足够大的纸，它的厚度是0.1毫米。请问折叠多少次，可以折成珠穆朗玛峰的高度？

为什么这里循环用while，因为不知道多少次，不然用for可以
*/



public class Ragnor_19_MountEverest{
	public static void main(String[] args){
		int mount_height = 8844430;
		int fold_times = 0;
		double paper_thickness = 0.1;

		while (paper_thickness < mount_height){  // 数值型都可以互相比较 
			paper_thickness += paper_thickness;
			fold_times ++;
		}
		System.out.println("最后纸张的厚度是：" + paper_thickness);
		System.out.println("最后纸张折叠的次数是：" + fold_times);  // 居然是27次，我还怀疑结果错了

	}
}