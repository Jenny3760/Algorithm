package while문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클_1110 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt( br.readLine() );

		int newN = n, length = 0;
		// while문보다 do-while을 썼을때 코드 가독성도 좋고 변수도 하나만 있으면 됨.. 
		do {
			newN = (newN % 10) * 10 + ( (newN/10)+(newN%10) ) % 10;
			length++;
		} while( n != newN ); 

		System.out.println(length);
	}

}
