package L1_20180128;

import java.util.Scanner;

/*
		 * L1-004. 计算摄氏温度
		
		时间限制
		400 ms
		内存限制
		65536 kB
		代码长度限制
		8000 B
		判题程序
		Standard
		作者
		陈建海
		给定一个华氏温度F，本题要求编写程序，计算对应的摄氏温度C。计算公式：C = 5*(F-32)/9。题目保证输入与输出均在整型范围内。
		
		输入格式：
		
		输入在一行中给出一个华氏温度。
		
		输出格式：
		
		在一行中按照格式“Celsius = C”输出对应的摄氏温度C的整数值。
		
		输入样例：
		150
		输出样例：
		Celsius = 65
 * */
public class L1_004 {
	public static void main(String[] args) {
		//C = 5*(F-32)/9
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=5*(a-32)/9;
		System.out.println("Celsius = "+b);
	}
}
