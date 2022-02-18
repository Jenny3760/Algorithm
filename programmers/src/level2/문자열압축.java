package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jenny
 * @date 2022. 2. 10. - 오전 12:53:32
 * @subject  프로그래머스 level 2
 * @content 문자열 압축
 */
public class 문자열압축 {

	public static void main(String[] args) {
		String s = "ababab";
		int answer = s.length();

		char[] cArr = s.toCharArray();
		char[] tmp = Arrays.copyOf(cArr, cArr.length);
		
		int idx = 1;
		String sub;
		for (int i = 0; i < cArr.length - (idx * 2 -1) ; i++) {
			sub = "";
			for (int j = i; j < i+idx; j++) {
				sub += cArr[j];
				int cnt = 2;
				while( !s.substring( i+idx, i+idx+idx ).equals(sub) ) {
					cArr[i] = (char)cnt++;
					
					i += idx;
				}
			}
			
		}
	
		

		//System.out.println(answer);
	}
}
