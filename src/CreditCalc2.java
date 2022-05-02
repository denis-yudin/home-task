import java.util.Scanner;

public class CreditCalc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int x = 0;
		do {
			amount = amount * 9 / 10;
			x++;
		} while (amount > 1000);
		System.out.println(amount);
		System.out.println(x);
	}
}