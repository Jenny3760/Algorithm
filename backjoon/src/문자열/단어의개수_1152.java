package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어의개수_1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] strs = null;
		int result = 0;
		if( !str.equals(" ") && !str.isEmpty() ) {
			strs = str.trim().split(" ");
			result = strs.length;
		}
		System.out.println(result);
	}

}
