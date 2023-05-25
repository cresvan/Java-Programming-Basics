
public class Triangle {

	public static void main(String[] args) {
		 int a = 7;
		 int b = 7;
		 int c = 8;

		 if (a==b && b==c && c==a) {
			 System.out.println("この三角形は正三角形です。");
		 } else if (a==b || b==c || c==a) {
			 System.out.println("この三角形は二等辺三角形です。");
		 } else {
			 System.out.println("この三角形は不等辺三角形です。");
		 }

	}

}
