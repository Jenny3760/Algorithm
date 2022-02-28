package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 알파벳찾기_10809 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = br.readLine();

		int[] location = new int[26];
		Arrays.fill(location, -1);
		
		for (int i = 0; i < s.length(); i++) {
			if( location[s.charAt(i)-97] == -1 )
				location[s.charAt(i)-97] = i;
		}
		
		for (int i = 0; i < location.length; i++) {
			bw.append(location[i] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
 	}

}
