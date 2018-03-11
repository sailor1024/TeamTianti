package L1_20180128;
/*
 * L1-010. 比较大小
		
		时间限制
		400 ms
		内存限制
		65536 kB
		代码长度限制
		8000 B
		判题程序
		Standard
		作者
		杨起帆（浙江大学城市学院）
		本题要求将输入的任意3个整数从小到大输出。
		
		输入格式：
		
		输入在一行中给出3个整数，其间以空格分隔。
		
		输出格式：
		
		在一行中将3个整数从小到大输出，其间以“->”相连。
		
		输入样例：
		4 2 8
		输出样例：
		2->4->8
 * */
import java.util.Scanner;


public class L1_010 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a1,a2,a3;
	a1=sc.nextInt();
	a2=sc.nextInt();
	a3=sc.nextInt();
	
	if(a1>a2){
		int temp=a1;
		a1=a2;
		a2=temp;
	}
	if(a1>a3){
		int temp=a1;
		a1=a3;
		a3=temp;
	}
	if(a2>a3){
		int temp=a2;
		a2=a3;
		a3=temp;
	}
	System.out.println(a1+"->"+a2+"->"+a3);
}
}
