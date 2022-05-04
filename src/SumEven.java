import java.util.Scanner;

public class SumEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, sum;
		int n = scanner.nextInt();
		
			a = n/100;
			while (a%2 != 0) {
				a = 0;
			}
			b = n%100/10;
			while (b%2 != 0) {
				b = 0;
			}
			c = n%10;
			while (c%2 != 0) {
				c = 0;
			}
		sum = a + b + c;
		System.out.print(sum);
	}
}