package if문;

import java.util.Scanner;

public class 알람시계_2884 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		m -= 45;
		
		if( m < 0 ) {
			h--;
			m += 60;
			if( h < 0 ) h += 24;
		}
		
		System.out.printf( "%d %d", h, m );

	}

}
