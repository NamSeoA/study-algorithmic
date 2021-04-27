package basic;

import java.util.Scanner;

public class practice6_basicMath {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 2292_벌집 
		/* 위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 
		숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
		예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
		첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
		입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
		13 -> 3
		
		
		int N = sc.nextInt(); // N번 방
		int count = 1; // 주어진 방까지 가는 최소 개수 
		int range = 2; // 최소 범위 2~
	
		if(N == 1) {
			System.out.println(count);
		}else {
			while (range <= N) {	// 범위가 N보다 커지기 직전까지 반복 
				range = range + (6 * count);	// 다음 범위의 최솟값으로 초기화 
				count++;	
			}
			System.out.println(count);
		}
		*/
		
		
		// 1193
		/*
		 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
		 X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
		 */
		
		int X = sc.nextInt();
 
		int cross_count = 1; // 해당 범위의 대각선 개수 
		int prev_count_sum = 0; // 해당 대각선 직전 대각선 까지의 칸의 누적 합 (X번째의 범위를 구하기 위한)
 
		
		while (true) {
			
			// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
			if (X <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분모가 큰 수부터 시작
					// 분모는 대각선 개수 - (X 번째 - 직전 대각선까지의 누적합 - 1) 
					// 분자는 X 번째 - 직전 대각선까지의 누적합  
					System.out.print((cross_count - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1)));
					break;
				}
 
			} else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
		
		
		
	}

}
