package _1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최소최대_10818 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt( br.readLine() );
		String[] nums = br.readLine().split(" ");
	
		int min = Integer.parseInt( nums[0]), max = Integer.parseInt( nums[0]);
		for (int i = 1; i < nums.length; i++) {
			int num =  Integer.parseInt( nums[i]);
			if( min > num ) min = num;
			if( max < num ) max = num;
		}
		
		/* 배열 안쓸때
	 	int min = 10000000, max = -1000000;
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt( st.nextToken() );
			if( m < min ) min = m;
			if( m > max ) max = m;
		}
		 */
		System.out.println(min + " " + max);
	}

}
