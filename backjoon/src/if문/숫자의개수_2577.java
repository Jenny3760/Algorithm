package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 숫자의개수_2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt( br.readLine() );
		int b = Integer.parseInt( br.readLine() );
		int c = Integer.parseInt( br.readLine() );
		
		String multi = a * b * c + "";
		
		int[] cnt = new int[10];
		
		for (int i = 0; i < multi.length(); i++) {
			cnt[ multi.charAt(i)-48 ]++;
		}
		
		for (int i = 0; i < cnt.length; i++) {
			bw.append(cnt[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
		
	}

}
