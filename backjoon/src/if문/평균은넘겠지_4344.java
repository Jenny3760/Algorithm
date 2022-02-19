package if문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 평균은넘겠지_4344 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter(System.out) );
		int c = Integer.parseInt( br.readLine() );
		
		StringTokenizer st;
		int[] scores = null;
		for (int i = 0; i < c; i++) {
			st = new StringTokenizer( br.readLine() );
			int n = Integer.parseInt( st.nextToken() );
			scores = new int[n];
			int sum = 0;
			for (int j = 0; j < n; j++) {
				scores[j] = Integer.parseInt( st.nextToken() );
				sum += scores[j];
			}
			double avg = (double)sum/n;
			int cnt = 0;
			for (int j = 0; j < scores.length; j++) {
				if( scores[j] > avg ) cnt++; 
			}
			bw.append( String.format("%.3f%%\n", (double)cnt/ n * 100 ) ); 
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
