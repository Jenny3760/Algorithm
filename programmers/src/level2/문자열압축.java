package level2;

/**
 * @author jenny
 * @date 2022. 2. 10. - 오전 12:53:32
 * @subject  프로그래머스 level 2
 * @content 문자열 압축
 */
public class 문자열압축 {

	public static void main(String[] args) {
		String s = "abcabcdede";
		int answer = s.length();

		for (int i = 1; i <= s.length()/2; i++) {
			String preStr = s.substring(0, i);	// 가장 첫번째 단어 가져오기.
			int length = 0;
			int cnt = 1; 
			
			for (int j = i; j < s.length() ; j += i) {	
				int start = j , end = (j + i > s.length()) ? s.length() : j + i;
				String nextStr = s.substring( start, end ); // 처음에 위치한 단어 다음부터 가져오기. 
				
				if( preStr.equals(nextStr) ) cnt++; // 앞과 뒤의 문자열이 같다면 카운트 +
				else {
					if( cnt != 1 ) {
						length += (int)Math.log10(cnt)+1;  // cnt의 자릿수를 알아오는 방법.
					}
					cnt = 1;
					length += i;
					preStr = nextStr;
				}
			}
			
			if( cnt != 1) length += (int)Math.log10(cnt)+1;
			length += preStr.length();
			if( answer > length ) answer = length;
		}
		
		System.out.println(answer);
	}
}

/* 처음에 푼 방식
String temp = "";

for (int i = 1; i <= s.length()/2; i++) {
	temp = "";
	for (int j = 0; j < s.length() ; j += i) {	
		String preStr = s.substring( j, (j + i > s.length()) ? s.length() : j + i );
		int cnt = 1; 
		if( j + i <= s.length() ) {
			while ( preStr.equals( s.substring(j+i, (j + i + i > s.length()) ? s.length() : j + i + i ) ) ) {
				cnt++;
				j += i;
				if ( j + i + i > s.length() ) break;
			} 
		}
		temp += (cnt == 1)? preStr : cnt + preStr;
	}
	if ( temp.length() < answer ) answer = temp.length();
}
*/

/* stringbuilder를 이용해서 속도를 조금 줄였다. 
StringBuilder temp = null;

for (int i = 1; i <= s.length()/2; i++) {
	temp = new StringBuilder();
	
	for (int j = 0; j < s.length() ; j += i) {	
		int start = j , end = (j + i > s.length()) ? s.length() : j + i;
		String preStr = s.substring( start, end );
		
		int cnt = 1; 
		if( j + i <= s.length() ) {
			while ( preStr.equals( s.substring( j+i, (j + i + i > s.length()) ? s.length() : j + i + i ) ) ) {
				cnt++;
				j += i;
				if ( j + i + i > s.length() ) break;
			} 
		}
		temp.append( (cnt == 1)? preStr : cnt + preStr );
	}

	if ( temp.length() < answer ) answer = temp.length();
}
*/