package 함수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 한수_1065 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int cnt = 0;
		for (int i = 1; i <= n; i++) {
			if( hanNum(i) ) cnt++; 
		}

		System.out.println(cnt);
	}

	private static boolean hanNum(int n) {

		List<Integer> list = new ArrayList<Integer>();

		while ( n != 0 ) {
			list.add( n % 10 );
			n /= 10;
		}

		if( list.size() > 2 ) {
			int i = 0;
			while( i+2 != list.size() ) {
				if( list.get(i) - list.get(i+1) != list.get(i+1) - list.get(i+2) ) return false;
				i++;
			}
		}

		return true;
	}
}
