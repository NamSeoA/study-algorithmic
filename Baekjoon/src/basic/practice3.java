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
		  */
		  
		  
		  // 2562
		  /*9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
			예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61
			이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
			
			첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
			첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		   
		  
		  	int[] num = new int[9];
		  	int max = 0;
		  	int number = 0;
			System.out.println("9개의 숫자를 입력하시오.");
			
			for(int i=0; i<9; i++) {
				num[i]= sc.nextInt();
				
				if(num[i]>max) {
					max = num[i];
					number = i+1;
				}
			}
			System.out.println("가장 큰 수 : " + max);
			System.out.println(number + "번째");
			*/
		  
			
		
			// 2577 ********
			/* 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
			예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
			계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		  	첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
		  	첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.    .
			
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			int[] counts = new int[10];
			int plus = A*B*C;
			
			System.out.println(plus);
			
			while (plus > 0) {
	            counts[plus % 10]++; // plus의 1의 자리수, 해당 배열의 위치값 +1
	            plus /= 10; // 한칸씩 shift 10의자리가 1의 자리가 됨 
	        }
	         
	        for (int i = 0; i < counts.length; ++i) {
	            System.out.println(counts[i]);
	        }
	        */
			
	        
	        // 3052 
	        /* 
	         두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
			 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		     첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 			 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
	        */
	        
			// 숫자 입력 받을 배열 
			int[] numbers = new int[10];
			int count = 0;
	        
	         // 숫자 입력 받고 42로 나눈 나머지 배열에 저장 
	        for(int i=0; i<10; i++) {
	        	numbers[i] = sc.nextInt()%42;
	        }
	        
	        // 10개 중 중복값이 있는지 검증하는 부분 
	        for(int i=0; i<10; i++) {  // 10번 반복 
	        	int cnt = 0;
	        	
	           for(int j=i+1 ;j<10 ;j++) {  // 0번째와 1번째가 같은지 1번째와 2번째가 같은지 .. 
	        	 
		        	if(numbers[i]==numbers[j]) { //순차로 진행된 j부터 같은값을 찾는다.
		        	   cnt++; // 같지 않으면 0 유지 
		        	 }
		        	} // 즉, 0 = 다름 
	        
		       // 같은 값이 없을 때만 숫자를 더해준다.
		       if(cnt==0) {   
		        count++;
		       }
	        }
	       // 서로 다른 값이 몇개 있는지 
	       System.out.println(count);  
	        
	       
	       
	   
	       
	       
	       
  }
}
