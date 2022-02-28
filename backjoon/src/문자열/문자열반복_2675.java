package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 문자열반복_2675 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt( br.readLine() );

		for (int i = 0; i < t; i++) {
			String rs = br.readLine();

			String[] strs = rs.split(" ");
			int r = Integer.parseInt(strs[0]);
			String	s = strs[1];
			
			for (int k = 0; k < s.length(); k++) {
				for (int j = 0; j < r; j++) {
					bw.append(s.charAt(k));
				}
			}

			bw.append("\n");

		}		

		bw.flush();
		bw.close();
		br.close();
	}

}
