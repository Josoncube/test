import java.util.Scanner;


public class jisuan2 {
	public static void main(String[] args) {
		jisuan2 n2=new jisuan2();
		Scanner one=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		double num1=one.nextDouble();
		System.out.println("请输入第二个数字");
		double num2=one.nextDouble();
		System.out.println("请输入第三个数字");
		double num3=one.nextDouble();
		double sum=n2.name(num1,num2,num3);
		System.out.println(sum);
		
}
	
	public double name(double a,double b,double c) {
		
		
		return a+b+c;		
	}
	
	
}
