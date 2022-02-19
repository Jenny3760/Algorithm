package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OX퀴즈_8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt( br.readLine() );
		
		/*
		String result = "";
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			result = br.readLine();
			String[] results = result.split("X");
		
			for (int j = 0; j < results.length; j++) {
				for (int k = 1; k <= results[j].length(); k++) {
					scores[i] += k;
				}
 			}
			bw.append(scores[i] + "\n" );
		}
		*/
		
		char[] chrs;
		int sum, plus;
		for (int i = 0; i < n; i++) {
			chrs = br.readLine().toCharArray();
			sum = 0;
			plus = 1;
			for (int j = 0; j < chrs.length; j++) {
				if ( chrs[j] == 'O' ) {
					sum += plus;
					plus++;
				}
				else {
					plus = 1;
				}
			}
			bw.append(sum + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();

	}

}
