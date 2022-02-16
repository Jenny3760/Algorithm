package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class AplusB8_11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt( br.readLine() );

		StringTokenizer st = null;
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out));
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer( br.readLine() );
			a = Integer.parseInt( st.nextToken() );
			b = Integer.parseInt( st.nextToken() );
			bw.append("Case #"+ (i+1) +": " +  a + " + " + b + " = ");
			bw.append(a+b + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
