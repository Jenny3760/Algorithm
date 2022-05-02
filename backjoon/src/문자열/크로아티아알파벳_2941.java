package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int cnt = 0;
	
		for (int i = 0; i < str.length(); i++) {
		
			if( i == str.length()-1 ) {
				cnt++;
				break;
			}
			
			if( str.charAt(i) == 'c' ) {
				if( str.charAt(i+1) == '=' ) i++;
				else if( str.charAt(i+1) == '-' ) i++;
			}
			else if( str.charAt(i) == 'd' ) {
				if( i < str.length()-2 && str.substring(i, i+3).equals("dz=") ) i += 2;
				else if( str.charAt(i+1) ==  '-' ) i++;
			}
			else if( str.charAt(i) == 'l' ) {
				if( str.charAt(i+1) == 'j' ) i++;
			}
			else if( str.charAt(i) == 'n' ) {
				if( str.charAt(i+1) == 'j' ) i++;
			}
			else if( str.charAt(i) == 's' ) {
				if( str.charAt(i+1) == '=' ) i++;	
			}
			else if( str.charAt(i) == 'z' ) {
				if( str.charAt(i+1) == '=' ) i++;
			}
		
			cnt++;
		}
		
		System.out.println(cnt);

	}

}
