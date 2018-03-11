package L1_20180128;
/*
 * L1-012. 计算指数

		时间限制
		400 ms
		内存限制
		65536 kB
		代码长度限制
		8000 B
		判题程序
		Standard
		作者
		陈越
		真的没骗你，这道才是简单题 —— 对任意给定的不超过10的正整数n，要求你输出2n。不难吧？
		
		输入格式：
		
		输入在一行中给出一个不超过10的正整数n。
		
		输出格式：
		
		在一行中按照格式“2^n = 计算结果”输出2n的值。
		
		输入样例：
		5
		输出样例：
		2^5 = 32
 * */
import java.util.Scanner;

public class L1_012 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=2;
	for(int i=1;i<a;i++){
		sum*=2;
		
	}
	System.out.println("2^"+a+" = "+sum);
}
}
