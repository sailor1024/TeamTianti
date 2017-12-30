package L1;

import java.util.Scanner;

public class L1_009 {
	public static void main(String[] args) {
		int q=2;
		System.out.println(5%2);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str[] = new String[a];
		int fenmu = 1;
		int fenzi[] = new int[a];
		for (int i = 0; i < a; i++) {
			str[i] = sc.next();

			fenmu *= Integer.parseInt((str[i].substring(str[i].indexOf("/") + 1, str[i].length())));

		}
		int sum = 0;
		for (int j = 0; j < str.length; j++) {
			fenzi[j] = Integer.parseInt((str[j].substring(0, str[j].indexOf("/") - 1)));
			fenzi[j] *= fenmu;
			fenzi[j] /= Integer.parseInt((str[j].substring(str[j].indexOf("/") + 1, str[j].length())));
			sum += fenzi[j];
		}
		int num1,num2;
		for (int i = 0; i < sum; i++) {
			
		if(sum%2==0&&fenmu%2==0){
			num1=sum/2;
			num2=fenmu/2;
			
		}
		if(fenmu%sum==0){
			num2=fenmu/sum;
			num1=1;
		}
}
		//System.out.println(num1);
	}
}
