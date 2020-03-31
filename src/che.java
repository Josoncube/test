import java.util.Scanner;


public class che {
	public static void main(String[] args) {
		
		che n1= new che();
		Scanner one=new Scanner(System.in);
		String[] strs = new String[5];
		for (int i = 0; i < strs.length; i++) {
			System.out.println("ÇëÊäÈë³µÅÆºÅ£º");
			strs[i]=one.next();		
		}
		String jieguo = n1.name(2, 5, strs);
		System.out.println(jieguo);
}
	

	private  String name(int sum1,int sum2,String[] strs){
		String jin="";
		for (; sum1-1<sum2-1 ; sum1++) {
		jin ="---"+strs[sum1-1]+jin;
		}
		return jin;
	}
}
