package if문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 나머지_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> numSet = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			int num =  Integer.parseInt( br.readLine() ) % 42;
			numSet.add( num );
		}

		System.out.println(numSet.size());
		
	}
}
