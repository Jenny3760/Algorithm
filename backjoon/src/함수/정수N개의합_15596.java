package 함수;

public class 정수N개의합_15596 {

	public static void main(String[] args) {
		int[] a = { 10,11,12,14,12,1,2 } ;
		
		System.out.println( sum(a) );
	}
	
	static long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
