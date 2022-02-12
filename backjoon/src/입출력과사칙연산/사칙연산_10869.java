package 입출력과사칙연산;

import java.util.Scanner;

public class 사칙연산_10869 {

	public static void main(String[] args) {
		// 문제에서는 입력받으라고 하지 않고 제시가 된다고 쓰여있다. 
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d\n%d", a+b, a-b, a*b, a/b, a%b);
		
	}

}
