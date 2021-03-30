package basic;

import java.util.Scanner;

public class practice1 {
	
	public static void main(String[] args) {

	int A;
	int B;
	
   // 1000번 (3월 29일)
   // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
   Scanner sc = new Scanner(System.in);
   
   System.out.println("A를 입력하세요.");
   A = sc.nextInt();
   System.out.println("B를 입력하세요.");
   B = sc.nextInt();
   
   System.out.println("A+B = " + (A+B));
   
  
   // 1330 (3월 29일)
   // 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
	/*  A가 B보다 큰 경우에는 '>'를 출력한다.
	    A가 B보다 작은 경우에는 '<'를 출력한다.
	    A와 B가 같은 경우에는 '=='를 출력한다. */
   A = sc.nextInt();
   B = sc.nextInt();
   
   if(A>B) {
	  System.out.println(">");
   }else if(A<B) {
	   System.out.println("<");
   }else if(A==B){
	   System.out.println("==");
   }
   
   
   // 9498번 (3월 29일)
   // 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
   // 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
   /* 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다. */
   
   System.out.println("시험 점수를 입력하시오.");
   int score = sc.nextInt();
   
   if(score <=100 && score >=90) {
	   System.out.println("A");
   }else if(score <= 89 && score >= 80) {
	   System.out.println("B");
   }else if(score <= 79 && score >= 70) {
	   System.out.println("C");
   }else if(score <= 69 && score >= 60) {
	   System.out.println("D");
   }else {
	   System.out.println("F");
   }
   
  
  
   
  }
}
