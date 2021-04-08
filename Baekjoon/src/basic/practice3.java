package basic;

import java.util.Scanner;

public class practice3 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 10952번
		/*
		 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 
		
		while(true){
			System.out.println("A를 입력하시오. ");
			int A = sc.nextInt();
			System.out.println("B를 입력하시오.");
			int B = sc.nextInt();
			
			if(A == 0 && B ==0) {
				break;
			} else {
				System.out.println("A + B = "+(A+B));
			}
		}
		*/
		
		// 1110
		/*0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 
		  각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
		  26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		  위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		  N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		
		  System.out.println("숫자 하나를 입력해주세요. ");
		  int N,num, a, b, sum;
		  int cnt=0;
		  
		  N = sc.nextInt();
		  num=N;
		  
		  while(true) {
			  a = num/10;
			  b = num%10;
			  sum = a+b;
			  cnt++;
			  num = b*10+sum%10;
			  if(N==num) {
				  break;
			  }
			  System.out.println(cnt);
			  sc.close();
		  }
		*/
		  
		  
		// 10818
		/*
		 N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. (N, N개의 정수)
		 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		 */
		  
		  System.out.println("정수의 개수를 입력해주세요.");
		  int N = sc.nextInt();
		  int[] array = new int[N];
		  int min = 1000000;
		  int max = -1000000;
		  
		  System.out.println(N+"개의 정수를 입력해주세요.");
		  for(int i=0; i<N; i++) {
			  array[i] = sc.nextInt();
			  if(array[i]<=min) {
				 min = array[i];
			  }else if (array[i]>max) {
				max = array[i];
			}
		  }
		  sc.close();
		  System.out.println(min+" "+max);
		  
		  
		  
		  
		  
		  
		  
  }
}
