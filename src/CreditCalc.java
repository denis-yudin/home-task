import java.util.Scanner;

public class CreditCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		for(int x = 0; x < 3; x++) {
			amount = amount * 9 / 10;
		}
		System.out.println(amount);
	}
}