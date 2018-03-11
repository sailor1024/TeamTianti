package L1_20180128;

import java.util.Date;

public class test {
	public static void main(String[] args) {
		int num=0;
		int num2=0;
		int fn=0;
		for(int i=0; i<=1000000;++i){
			Date da=new Date();
			if(i==0){
				num=Integer.parseInt(((da.getTime()+"").substring(5)));
				System.out.println(num);
				
			}
			if(i==1000000){
				num2=Integer.parseInt(((da.getTime()+"").substring(5)));
				System.out.println(num2);
				System.out.println(num2-num);
				
				
			}
			
			
			//System.out.println(i);
		}
	}
}
