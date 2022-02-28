package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class 단어공부_1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		/*
		int[] numOfAlphabets = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			numOfAlphabets[ str.charAt(i) - 65 ]++;
		}
		
		int max = 0;
		char maxAlpha = '?';
		
		for (int i = 0; i < 26; i++) {
			if( numOfAlphabets[i] > max ) {
				max = numOfAlphabets[i];
				maxAlpha = (char)(i+'A');
			} else if( numOfAlphabets[i] == max ) {
				maxAlpha = '?';
			}
		}
		*/
		/*
		int max = numOfAlphabets[0];
		for (int i = 1; i < numOfAlphabets.length; i++) {
			if( max < numOfAlphabets[i] ) max = numOfAlphabets[i];
		}
		
		char maxAlpha = ' ';
		for (int i = 0; i < numOfAlphabets.length; i++) {
			if( numOfAlphabets[i] == max ) {
				if( maxAlpha == ' ')
					maxAlpha = (char) (i+65) ;
				else 
					maxAlpha = '?';
			}
		}
		*/
		
	//	System.out.println(maxAlpha);
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (int i = 0; i < str.length(); i++) {
			if( map.containsKey(str.charAt(i)) ) {
				int cnt = map.get(str.charAt(i));
				cnt++;
				map.put(str.charAt(i), cnt);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
	
		int max = Collections.max(map.values());
		
		char maxAlpha = ' ';
		Iterator<Entry<Character, Integer>> ir = map.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<Character, Integer> entry = (Entry<Character, Integer>) ir.next();
			if( entry.getValue() == max ) {
				if( maxAlpha == ' ')
					maxAlpha = entry.getKey() ;
				else 
					maxAlpha = '?';
			}
		}
		
		System.out.println(maxAlpha);
		
	}

}
