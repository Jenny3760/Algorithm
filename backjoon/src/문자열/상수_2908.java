package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상수_2908 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		
		String n1 = "" + num1.charAt(2) + num1.charAt(1) + num1.charAt(0);
		String n2 = "" + num2.charAt(2) + num2.charAt(1) + num2.charAt(0);

		System.out.println( Math.max(Integer.parseInt(n1), Integer.parseInt(n2)) );

	}

}
