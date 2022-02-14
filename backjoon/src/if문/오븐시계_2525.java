package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 오븐시계_2525 {

	public static void main(String[] args) throws IOException {
		// Scanner를 사용하는 방법
		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		int min = scanner.nextInt();
		
		// BufferedReader로 사용하는 방법
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		h += min / 60;
		m += min % 60;

		if( m >= 60 ) {
			h++;
			m -= 60;
		}
		if ( h >= 24 ) h -= 24;
		
		System.out.println(h + " " + m);
	}

}
