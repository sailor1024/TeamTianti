package L1;

import java.util.Scanner;

public class L1_042 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String b[]=a.split("-");
	System.out.println(b[2]+"-"+b[0]+"-"+b[1]);
}
}
