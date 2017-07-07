
public class ConvertPound2Kilograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double p = 200d;
		double k = p * 0.45359237d;
		System.out.println("Pound is:" + k);

		char reg = '\u00AE';
		System.out.println(reg);
		double d1 = 20d, d2 = 80d, result, sum;
		result = (d1 + d2) * 25d;
		sum = result + d1 + d2;
		double remainder = sum % 40;
		if (remainder <= 20) {
			System.out.println("The total was over the limit :");
		}
	}
}
