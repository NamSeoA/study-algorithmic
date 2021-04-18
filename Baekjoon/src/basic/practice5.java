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
		
		
		// 10809
		/*
		 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		 */
		
		int[] words = new int[26];

		for(int i=0; i<words.length; i++) {
			words[i] = -1; // 단어에 포함되어 있지 않을 
		}
		
		// 입력 
		System.out.println("원하시는 영어단어를 입력하시오.");
	    String S = sc.next();
	    
	    for(int i=0; i<S.length(); i++) {
	    	char ch = S.charAt(i); // 입력받은 문자 나누기 
	    	
	    	// 동일 문자가 포함되어 있는 경우 처음 나타난 위치로 나타내야함. 앞선 동일문자가 존재해서 위치를 변경했을 경우 변경하지 않아도 됨 
	    	if(words[ch - 'a'] == -1) { // 즉, -1인 경우 배열의 원소 값을 변경. -1이 아닌 경우 변경하지 않음 
	    		words[ch -'a'] = i;  // a=97,    b-'a' = 1
	    	}
	    }
	    
	    for(int i=0; i<words.length; i++) { // 배열 출력 
	    	System.out.print(words[i] + " ");
	    }
	    sc.close();
		
	}
}
