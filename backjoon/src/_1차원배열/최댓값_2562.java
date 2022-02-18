package _1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = 0, idx = 0;
		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt( br.readLine() );
			if( max < n ) {
				max = n;
				idx = i + 1;
			}
		}
		
		/* 배열 썼을때 
		int[] nums = new int[9];
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt( br.readLine() );
			if( max < nums[i] ) max = nums[i];
		}
		
		int idx = 0;
		for (int i = 0; i < nums.length; i++) {
			if( nums[i] == max ) {
				idx = i+1;
				break;
			}
		}
		*/
		
		System.out.println( max + "\n" + idx);
	}

}
