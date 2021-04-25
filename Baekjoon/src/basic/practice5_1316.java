package basic;

import java.util.Scanner;

public class practice5_1316 {

	/*
	 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
	 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
	 aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다. 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	 첫째 줄에 그룹 단어의 개수를 출력한다.
	 */
	
	/*
	 문제 풀이
	 1. 몇개의 문자열을 입력 받을 지에 대한 N개를 입력받음 
	 2. N개의 문자열을 입력받음 
	 3. 각 알파벳이 떨어져 있는지 확인하기 위해 논리형의 26개(알파벳의 개수는 26)의 배열을 생성 -> 1=a를 시작으로 해당 알파벳이 있으면 그 해당 배열을 true로 바꿔줘서
	 입력받은 문자열의 길이만큼 배열이 true일 때 그룹단어를 인정.
	 4. 그렇게 true일 때마다 카운팅을 해서 최종 그룹단어의 개수를 출력 
	 */
	
	/*
	 내가 더 보충해야할 점 
     - N개와 N개의 문자열을 바로 동시에 받지 않고 아래와 같이 N번 반복하는 반복문 안에 문자열을 입력받는 함수를 넣어도 됨.
     - if else 활용법 
	 */
	
	static Scanner sc = new Scanner(System.in); // main에서도 반영받기 위해 static 선언 
	 
	public static void main(String[] args) {
 
		int count = 0; // 그룹함수의 총 개수 
		int N = sc.nextInt(); // N개의 문자열 
 
		for(int i = 0; i < N; i++) { // 문자열의 개수 만큼 반복문을 돌려서 true인 check함수 카운팅 
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}// Main

	
		// 그룹함수인지 체크하는 함수 
		public static boolean check() {
			boolean[] check = new boolean[26]; // 알파벳의 개수만큼 논리형 배열 생성 
			int prev = 0; // 전 문자 
			String str = sc.next();
			
			for(int i = 0; i < str.length(); i++) {
				int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)
				
				
				// 앞선 문자와 i 번째 문자가 같지 않은 경우 
				if (prev != now) {		
					
					// 해당 문자가 처음 나오는 경우 (false 인 경우_boolean의 초기값 false)
					if ( check[now - 'a'] == false ) {
						check[now - 'a'] = true;	// true 로 바꿔준다
						prev = now;					// 다음 턴을 위해 prev도 바꿔준다 
					}
		 
					// 해당 문자가 이미 나온 적이 있는 경우(그룹단어가 아니게 됨) 
					else {
						return false;	//함수 종료
					}
				} 																	//if
				// 앞선 문자와 i 번째 문자가 같은 경우(연속된 문자)
				// else 문은 없어도 됨
				else {
					continue;
				}
			}// for문    
			return true;
		} // check

}
