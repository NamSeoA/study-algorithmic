package basic;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    // 2884번 (3월 30일)
		/* 
		 상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
	     상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
	     이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
	     바로 "45분 일찍 알람 설정하기"이다. 이 방법은 단순하다. 
	     원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 
	     어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
		 현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오. 
		     
		 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
		 입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다. 
		  
		   int H; //0 ≤ H ≤ 23 H시 
		   int M; //0 ≤ M ≤ 59 M분 
		   
		   System.out.println("알람을 등록해주세요.");
		   System.out.println("시간을 입력해주세요.");
		   H = sc.nextInt();
		   System.out.println("분을 입력해주세요.");
		   M = sc.nextInt();
		   
		   
		   if(M > 45) {
			   System.out.println(H+"시"+(M-45)+"분 알람이 등록되었습니다.");
		   }else if(M==45) {
			   System.out.println(H+"시 알람이 등록되었습니다.");
		   } else{
			   if(H == 0) {
				   H = 24;
			   }
			   System.out.println((H-1)+"시"+(60-(45-M))+"분 알람이 등록되었습니다.");
		   }
		   */
		   
		   // 헷갈렸던 부분
		   /*
		    System.out.println((H-1)+"시"+(60-(45-M))+"분 알람이 등록되었습니다.");
		    이 부분에서 처음에 분을 계산할 때 45-M 이렇게 분을 계산했는데 그렇게 되면 정확한 수치가 나오지 않았다.
		    빼기를 할 때 빼기 모자르면 앞에서 10 빌려와서 계산하는 것 처럼 10 - 45를 할 수 없으니 60분을 빌려와서 계산을 해야함 !
		    물론 빌려왔으니 시간은 -1 이 되어야한다 ~!
		    */
		
		 
		  // for문 ================================================================================ 
		   
		  // 2739 (3월 31일)
		  /*
		   N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		   첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		  
		   
		  int N;
		  System.out.println("숫자를 입력해주세요.");
		  N = sc.nextInt();
		  sc.close();
		
		  System.out.println(N + "단을 출력합니다. "); 
		  
		 for(int i=1; i<=10; i++) {
			System.out.println(N + "*" + i + "=" + (N*i));
		 }
	  
		 */  
		 
		 // 10950번 (4월 1일)
		 /* 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. 
		    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
			각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		  
		   
		 
		   System.out.println("몇번 더하겠습니까?");
		   int T = sc.nextInt();
		   
		   
		   for(int i=0; i<T; i++) {
			   int A = sc.nextInt();
			   int B = sc.nextInt();
			   System.out.println(A+B);
		   }
		   */
		 
		   
		   // 8393번 (4월 1일)
		   /*
		    n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		    첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		  
		   int n = sc.nextInt();
		   int sum = 0;
		   
		   for(int i=1; i<=n; i++) {
			   sum += i;
		   }
		   System.out.println(sum);
		   
		    */
		   
		   
		   // 15552번 
		   /*
		    첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		    각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다. 
		    
		   
		   int T = sc.nextInt();
		  
		   for(int i=0; i<T; i++) {
			   int A = sc.nextInt();
			   int B = sc.nextInt();
			   System.out.println(A+B);
		   }
		   
		   */
		   
		
		   /*
		   import java.util.StringTokenizer;
		   public class Main {
		   	
		   	public static void main(String[] args) throws IOException { // IO Exception처리 필수
		   		
		   		// Reader와 Writer를 선언
		   		// 각각 InputStreamReader와 OutputStreamWriter를 통해 입력
		   		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		   		
		   		// read로 입력받은 데이터를 가공하기 위한 Tokenizer 선언
		   		// BufferedReader로 입력한 값은 전부 String으로 리턴되므로 토큰화하여 가공해야함
		   		StringTokenizer st;
		   		
		   		// String값이 리턴되므로 필요한 형태로 형변환 해줘야한다.
		   		int T = Integer.parseInt(br.readLine());
		   		
		   		for(int i=0; i <T; i++) {
		   			
		   			// String으로 입력받은 값을 Token화 하여
		   			st = new StringTokenizer(br.readLine());
		   			
		   			// 토큰별로 잘라서 원하는 형태로 데이터 형변환 후
		   			int A = Integer.parseInt(st.nextToken());
		   			int B = Integer.parseInt(st.nextToken());
		   		
		   			int result = A+B;
		   			
		   			// 결과 출력
		   			bw.write(result +"\n"); // 자동 줄바꿈이 없기때문에 "\n"을 통해 줄바꿈해준다.
		   			
		   		}
		   		
		   		// Writer의 경우 반드시 flush()나 close()를 호출해 닫아주어야 한다.
		   		bw.flush();	
		   		
		   	}
		   	
		   }
			*/
		   
		
		   // 2438
		   /*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		   
		   int N = sc.nextInt();
		   
		   for(int i=0; i<N; i++) {
			   for(int j=0; j <= i; j++) {
				   System.out.print("*");
			   }
			   System.out.println(""); 	//행을 바꿔주기 위한 공백 
		   }
		   
		    // BufferedReader 사용 
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int N = Integer.parseInt(br.readLine());
	        br.close();
	        
			for(int i=1; i <=N; i++) {
				for(int j=1; j <=i; j++) {
					bw.write("*");
			
				}
				bw.newLine();
			}
	        bw.flush();
	        bw.close();
	        
		   */
		   
		
		   
		   // 2439번 
		   /*첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
			하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.*/
		   int M = sc.nextInt();
		   
		   for(int i=0; i<M; i++) {
			   for(int j=i+1; j<M; j++) {
				   System.out.print(" "); //공백이 갯수만큼 채워지기 전에 다음줄로 바뀌면 안되므로 print 사용 
			   }
			   for(int k=M-i; k<=M; k++) { //예를 들어 M=5이고, i=0이면 M-i부터 M까지 "*"가 출력되어야한다.
				   System.out.print("*"); // 첫 줄에 "*"이 한 번 출력된다.
			   }
			   System.out.println(""); //다음줄로 넘어가기 위함 
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
	
	}
}
