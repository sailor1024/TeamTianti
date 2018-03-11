package L1_20180128;
/*
 L1-016. 查验身份证

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
		一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：
		
		首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：
		
		Z：0 1 2 3 4 5 6 7 8 9 10
		M：1 0 X 9 8 7 6 5 4 3 2
		
		现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。
		
		输入格式：
		
		输入第一行给出正整数N（<= 100）是输入的身份证号码的个数。随后N行，每行给出1个18位身份证号码。
		
		输出格式：
		
		按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后1位校验码计算准确。如果所有号码都正常，则输出“All passed”。
		
		输入样例1：
		4
		320124198808240056
		12010X198901011234
		110108196711301866
		37070419881216001X
		输出样例1：
		12010X198901011234
		110108196711301866
		37070419881216001X
		输入样例2：
		2
		320124198808240056
		110108196711301862
		输出样例2：
		All passed 
 * */
import java.util.Scanner;

public class L1_016 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int sum2[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	int sum=0;
	for(int i=0;i<sum2.length;i++){
		sum+=sum2[i];
	}
	int a=sc.nextInt();
	String str[]=new String[a];
	int sum1[]=new int[a];
	for(int i=0;i<a;i++){
		str[i]=sc.next();
		
		for(int j = 0;j<str[i].length();j++){  
			 int temp = Integer.parseInt(str[i].substring(j,j+1)); 
			 sum1[i]+=temp;
			 }
		sum1[i]+=sum;
		sum1[i]%=11;
	}
	//int sumz[]={0,1,2,3,4,5,6,7,8,9,10}; 
	//int summ[]=
	int you=0;
	for(int i=0;i<sum1.length;i++){
		
		if(sum1[i]==0&&str[i].substring(17, 18)=="1"){
			
		}else if(sum1[i]==1&&str[i].substring(17, 18)=="0"){
			
		}else if(sum1[i]==2&&str[i].substring(17, 18)=="X"){
			
		}else if(sum1[i]==3&&str[i].substring(17, 18)=="9"){
			
		}else if(sum1[i]==4&&str[i].substring(17, 18)=="8"){
			
		}else if(sum1[i]==5&&str[i].substring(17, 18)=="7"){
			
		}else if(sum1[i]==6&&str[i].substring(17, 18)=="6"){
			
		}else if(sum1[i]==7&&str[i].substring(17, 18)=="5"){
			
		}else if(sum1[i]==8&&str[i].substring(17, 18)=="4"){
			
		}else if(sum1[i]==9&&str[i].substring(17, 18)=="3"){
			
		}else if(sum1[i]==10&&str[i].substring(17, 18)=="2"){
			
		}else{
			sum1[i]=11;
			you++;
		}
	}
	if(you!=0){
		for(int i=0;i<sum1.length;i++){
			if(sum1[i]==11){
				System.out.println(str[i]);
			}
		} 
	}else{
		System.out.println("meiyou");
	}
	     
}
}
