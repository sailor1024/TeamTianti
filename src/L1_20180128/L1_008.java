package L1_20180128;
/*
 * 		L1-008. 求整数段和

		时间限制
		400 ms
		内存限制
		65536 kB
		代码长度限制
		8000 B
		判题程序
		Standard
		作者
		杨起帆
		给定两个整数A和B，输出从A到B的所有整数以及这些数的和。
		
		输入格式：
		
		输入在一行中给出2个整数A和B，其中-100<=A<=B<=100，其间以空格分隔。
		
		输出格式：
		
		首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中输出全部数字的和。
		
		输入样例：
		-3 8
		输出样例：
		   -3   -2   -1    0    1
		    2    3    4    5    6
		    7    8
		Sum = 30
 * */
import java.util.Scanner;

public class L1_008 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int sum=0;
		int chang=0;
		for(int i=a1;i<=a2;i++){
			sum+=i;
			String leng=i+"";
			if(leng.length()==1){
				System.out.print("    ");
				
			}else if(leng.length()==2){
				System.out.print("   ");
			}else if(leng.length()==3){
				System.out.print("  ");
			}else if(leng.length()==4){
				System.out.print(" ");
			}
			System.out.print(i);
			chang++;
			if(chang%5==0||i==a2){
				System.out.println();
			}
			}
		
		System.out.println("Sum = "+sum);
		
	}

}
