package basic;

import java.util.Scanner;

public class practice3 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		// 10952번
		/*
		 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 */
		
		
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
		
		
		
		
  }
}
