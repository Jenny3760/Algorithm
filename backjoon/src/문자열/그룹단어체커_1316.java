package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt( br.readLine() );
		
		int cnt = n;
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for (int j = 0; j < str.length(); j++) {
				String ch = str.substring(j, j+1);
				String check = str.substring(j, str.lastIndexOf(ch)+1);
				if( !check.equals( ch.repeat(str.lastIndexOf(ch) - j + 1 )) ) {
					cnt--;
					break;
				}
				j += str.lastIndexOf(ch) - j;
			}
		}
		
		System.out.println(cnt);

	}

}

/*
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine()), ans = 0;
        
        for(int i = 0; i < N; i++)
            ans += check(in.readLine().toCharArray());
        
        System.out.print(ans);
        
    }
    
    private static int check(char[] word) {
        boolean[] sw = new boolean[26];
        
        for(int i = 0; i < word.length; i++) {
            if(sw[word[i] - 'a'])
                return 0;
            
            sw[word[i] - 'a'] = true;
            
            while(i < word.length - 1 && word[i + 1] ==word[i])
                i++;
        }
        
        return 1;
    }
    
}
*/
