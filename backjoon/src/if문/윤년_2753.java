package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 윤년_2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt( br.readLine() );

		// 삼항연산자를 이용하기
		System.out.println( year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0 )? "1" : "0");
		
		// 메서드를 이용하기 
		if( isLeapYear(year) ) System.out.println("1");
		else System.out.println("0");
	}

	private static boolean isLeapYear(int year) {
		return  year % 4 == 0 && ( year % 100 != 0 || year % 400 == 0 );
	}


}
