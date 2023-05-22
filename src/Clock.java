
public class Clock {

	public static void main(String[] args) {
		int seconds = getSeconds(15, 50, 35);
		System.out.println(seconds);
	}

	public static int getSeconds(int h, int m, int s) {
		int result = h * 3600 + m * 60 + s;
		return result;
	}

}

