import java.util.jar.Attributes.Name;


public class Text {
//git²âÊÔ
	public static void main(String[] args) {
		Text n1 = new Text();
		int cishu = n1.name();
		System.out.println("ÕÛµşÁË"+(cishu+1));
	}
	
	public int name() {
		int sum=0;
		int n=1;
		for (double i = 1; i < 884800;) {
			n++;
			i=Math.pow(2,n);
			sum=sum+1;			
		}
		return sum;
	}
}
