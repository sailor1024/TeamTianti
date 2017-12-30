package L1;

import java.util.Scanner;

public class L1_017 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char ch[] = str.toCharArray();
		int sum2 = 0;
		double a = 1;
		int leng = str.length();
		
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == '-') {
				leng--;
				a *= 1.5;
			}
			if (ch[i] == '2') {
				sum2++;
			}

		}
		if (Integer.parseInt(ch[(str.length() - 1)] + "") % 2 == 0) {

			a *= 2;
		}
		
		System.out.println(String.format("%.2f", sum2/(double)leng*a*100)+"%");
		
	}

}