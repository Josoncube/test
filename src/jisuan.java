import java.util.Scanner;


public class jisuan {
	public static void main(String[] args) {
		//jisuan n1=new jisuan();
		Scanner one = new Scanner(System.in);
		System.out.println("�����һ������");
		int num1 = one.nextInt();
		System.out.println("����ڶ�������");
		int num2 = one.nextInt();
		
		int sum=name(num1, num2);
		System.out.println(sum);
		
}
	
	public static int name(int a,int b) {
	
		return a+b;
		
	}
}
