package 입출력과사칙연산;

import java.util.Scanner;

public class 곱셈_2588 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int _3 = a * ( b % 10 );
		int _4 = a * ( (b / 10 ) % 10 );
		int _5 = a * ( (b / 100 ) % 10 );
		
		System.out.println( _3 );
		System.out.println( _4 );
		System.out.println( _5 );
		System.out.println( _3 + _4 * 10 + _5 * 100 );
	
	}

}
