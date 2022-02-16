package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 별찍기2_2439 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for (int i = 1; i <= n; i++) {
			for (int j = n-i; j > 0; j--) {
				bw.append(" ");
			}
			for (int j = 0; j < i; j++) {
				bw.append("*");
			}
			bw.append("\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
