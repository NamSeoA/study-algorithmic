package basic;

public class practice4_function {
	
	// 15596
		/*
		 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		 Java: long sum(int[] a); (클래스 이름: Test) -> practice4_function
	     a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		 리턴값: a에 포함되어 있는 정수 n개의 합
		 */
		
		static long sum(int[] a) {
			long sum = 0; // a에 포함되어 있는 정수 n개의 합
		
			for(int i=0; i<a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
		
		public static void main(String[] args) {
			
			int[] a = {5,10,15};
			long final_sum = sum(a);
			
			System.out.println("배열의 총 합 : "+ final_sum);
		}
}
