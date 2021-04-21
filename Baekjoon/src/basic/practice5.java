package basic;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		
		// 11720
		/*
		 N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
		 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
		 입력으로 주어진 숫자 N개의 합을 출력한다.
		
		int N = sc.nextInt(); //숫자의 개수
		String numbers = sc.next(); // 숫자들 입력 
		
		int sum = 0; // numbers에 담긴 숫자들 총 합 
		
		for(int i=0; i<N; i++) {
			
			sum += numbers.charAt(i)-'0'; // String -> char -> int 
			// string -> char : numbers.charAt(i)
			// char -> int : numbers.charAt(i)- '0' (각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 가지게 됨)
		}
		System.out.println("숫자의 총 합 : " + sum);
		*/
		
		
		// 10809
		/*
		 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		
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
		*/
	    
	    
	    // 2675 
	    /*
	     문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
	     S에는 QR Code "alphanumeric" 문자만 들어있다. QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
		 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
		 각 테스트 케이스에 대해 P를 출력한다.
		
		int T = sc.nextInt(); //테스트 케이스 개수
		
		for(int i=0; i<T; i++) {
			
			int R = sc.nextInt(); // R번 만큼 반복할 
			String S = sc.next(); // 문자열 입력 
			
		  for(int j=0; j<S.length(); j++) {
			for(int k=0; k<R; k++) { // R만큼 반복 
				S.charAt(j);
			}
		   }
		}
		
		System.out.println();
		*/
		
		
		
		// 1157
		/*
		  알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		  첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
		  첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 
		
		int[] arr = new int[26]; // 영문자의 개수 26개 , 알파벳 카운트를 저장할 배열 
		String eng = sc.next(); //알파벳으로 이루어진 단어 
		
		for(int i=0; i<eng.length(); i++) {
			
			if('A' <= eng.charAt(i) && eng.charAt(i) <= 'Z') { // 대문자 범
				arr[eng.charAt(i) - 'A']++; // 65 - 65 =0 이므로 위 arr 배열의 0번째에는 a부터 순차적으로 개수를 샌다 
			}else {
				arr[eng.charAt(i) - 'a']++;
			}
		}
		
		int max = -1; // 가장 큰 값을 가지고 있는 알파벳 수를 저장 
		char ch = '?'; // 출력할 문자 
		
		// 가장 많이 사용된 알파벳을 대문자로 출력하기 위한 반복문 
		for(int i=0; i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);  // 대문자로 출력해야하므로 65를 더해준다 & char 형 타입의 변수에 int와 char을 연산하여 저장할 경우 반드시 캐스팅
			}else if(arr[i] == max) {
				ch = '?'; // 배열 원소값이 max 값이랑 같을 경우 최대 개수의 문자가 2개 이상이라는 의미이므로 ch를 물음표(?) 로 바꾸어 주어야 함 
			}
		}
		System.out.println("가장 많이 사용된 알파벳 : " + ch);
		*/
		
		
		// 1152 
		/*
		 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 
		 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 
		 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
		 첫째 줄에 단어의 개수를 출력한다.
		 */
				
		String words = sc.nextLine(); //문장 입력 받기 
		
		String[] sentance = words.split(" "); // 공백 기준으로 문자 저장 
		
		if(sentance.length > 0) {
			System.out.println(sentance.length);
		}else {
			System.out.println("0");
		}
				
		
		
		
		
		
		
		
		
	}
}
