package if문;

import java.util.Scanner;

public class 두수비교하기_1330 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println( ( a == b ) ? "==" : ( a > b )?  ">" : "<"  );

	}

}
