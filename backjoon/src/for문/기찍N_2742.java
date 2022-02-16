package for문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 기찍N_2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// System.out.println 으로 출력시 1344ms
		// BufferedWriter 로 출력시 208ms
		// 시간이 많이 단축되는걸 볼 수 있다.
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = n; i > 0; i--) {
			bw.append(i + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
