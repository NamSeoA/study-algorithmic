package basic;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
	
		// 11720
		/*
		 N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 입력으로 주어진 숫자 N개의 합을 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt(); //숫자의 개수
		String numbers = sc.next(); // 숫자들 입력 
		
		int sum = 0; // numbers에 담긴 숫자들 총 합 
		
		for(int i=0; i<N; i++) {
			
			sum += numbers.charAt(i)-'0'; // String -> char -> int 
			// string -> char : numbers.charAt(i)
			// char -> int : numbers.charAt(i)- '0' (각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 됨)
		}
		System.out.println("숫자의 총 합 : " + sum);
		
		
		
		
		
		
	}
}
