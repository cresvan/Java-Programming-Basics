
public class Review01 {

	public static void main(String[] args) {
		int grossPrice = 3999;
		double tax = 0.1;
		double netPrice = grossPrice + tax(grossPrice, tax);
		System.out.println( grossPrice + "円の商品の税込価格は" + (int) netPrice + "円（消費税は" + (int) tax(grossPrice, tax) + "円）です。");

	}

	public static double tax(int grossPrice, double tax) {
		double taxAmount = grossPrice * tax;
		return taxAmount;
	}

}
