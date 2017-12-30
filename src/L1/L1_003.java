package L1;

import java.util.Scanner;

public class L1_003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		char ch[] = s1.toCharArray();
		char cha1[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		int[] sun = new int[10];

		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < cha1.length; j++) {
				if (ch[i] == cha1[j]) {
					sun[j]++;
					break;
				}
			}
		}

		for (int i = 0; i < sun.length; i++) {
			if (sun[i] != 0) {

				System.out.println(i + ":" + sun[i]);
			}
		}
	}
}
