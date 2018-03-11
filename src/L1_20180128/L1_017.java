package L1_20180128;

/*
 * L1-017. 到底有多二

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
		一个整数“犯二的程度”定义为该数字中包含2的个数与其位数的比值。如果这个数是负数，则程度增加0.5倍；如果还是个偶数，则再增加1倍。例如数字“-13142223336”是个11位数，其中有3个2，并且是负数，也是偶数，则它的犯二程度计算为：3/11*1.5*2*100%，约为81.82%。本题就请你计算一个给定整数到底有多二。
		
		输入格式：
		
		输入第一行给出一个不超过50位的整数N。
		
		输出格式：
		
		在一行中输出N犯二的程度，保留小数点后两位。
		
		输入样例：
		-13142223336
		输出样例：
		81.82%

 * */

import java.util.Scanner;

public class L1_017 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char ch[]=str.toCharArray();
		double sum=1;
		int shu2=0;
		int leng=str.length();
		double result;
		if(ch[0]=='-'){
				sum*=1.5;
				leng--;
				
		}
		if(Integer.parseInt((ch[str.length()-1]+""))%2==0){
				sum*=2;
				
			}
		for(int i=0;i<ch.length;i++){
			
			
			if(ch[i]=='2'){
				shu2++;
				
			}
		}
		result=shu2*sum/leng*100;
		String df = String.format("%.2f", result);
		System.out.println(df+"%");
		
	}
}
