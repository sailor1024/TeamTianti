package L1_20180128;

import java.util.Scanner;

public class L1_003_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[10];
		
		String b=sc.next();
		char ch[]=b.toCharArray();
		for(int i=0;i<ch.length;i++){
			
			if(ch[i]=='0'){
				arr[0]++;
			}
			if(ch[i]=='1'){
				arr[1]++;
			}
			if(ch[i]=='2'){
				arr[2]++;
			}
			if(ch[i]=='3'){
				arr[3]++;
			}
			if(ch[i]=='4'){
				arr[4]++;
			}
			if(ch[i]=='5'){
				arr[5]++;
			}
			if(ch[i]=='6'){
				arr[6]++;
			}
			if(ch[i]=='7'){
				arr[7]++;
			}
			if(ch[i]=='8'){
				arr[8]++;
			}
			if(ch[i]=='9'){
				arr[9]++;
			}
			
		}
		
		for(int i=0;i<10;i++){
			if(arr[i]!=0){
				System.out.println(i+":"+arr[i]);
			}
		}
	}
}
