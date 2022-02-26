package 함수;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 셀프넘버_4673 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 1; i <= 10000; i++) {
			set.add(i);
		}
		
		for (int i = 1; i <= 10000; i++) {
			set.remove(d(i));
		}
	
		Iterator<Integer> ir = set.iterator();
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer num = (Integer) iterator.next();
			bw.append(num + "\n");
		}
		*/
		
		boolean[] isSelfNumber = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int selfNum = d(i);
			if( selfNum <= 10000 ) 
				isSelfNumber[selfNum] = true;
		}
		
		for (int i = 1; i <= 10000 ; i++) {
			if( !isSelfNumber[i] ) bw.append(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}

	private static int d(int n) {
		int cnt = (int)(Math.log10(n) +1);
		int value = 1, sum = n;
		for (int i = 0; i < cnt; i++) {
			sum += n / value % 10;
			value *= 10;
		}
		return sum;
	}
}
