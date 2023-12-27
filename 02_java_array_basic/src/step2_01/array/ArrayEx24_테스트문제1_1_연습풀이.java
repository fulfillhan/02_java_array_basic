package step2_01.array;
import java.util.Arrays;
//2023-12-26
import java.util.Scanner;

public class ArrayEx24_테스트문제1_1_연습풀이 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		int[] a = { 10 , 4 , 5 , 3 , 1 };
		
		
		// 문제 1) 전체 요소의 합출력
		
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		System.out.println(total);
		
		// 문제 2) 데이터를 입력하면 배열의 인덱스 출력
		// 예) 5 => 2  ,  1 => 4
		
		System.out.print("숫자 입력 : ");
		int data = scan.nextInt();
		int idx = 0;
		for (int i = 0; i < a.length; i++) {
			if (data == a[i]) {
				idx = i;
			}
			
		}
		System.out.print("=> "+ idx);
		System.out.println("\n------------------------------");
		
		// 문제 3) 배열의 인덱스를 입력하면 데이터 출력
		// 예) 2 => 5  , 4 => 1
		int dataNum = 0;
		System.out.print("배열의 인덱스 입력 : ");
		int idxNum = scan.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (idxNum == i) {
				dataNum = a[i];
			}
		}
		System.out.print("=>"+ dataNum);
		System.out.println("\n------------------------------");
		

		// 문제 4) 배열중 가장 큰 데이터 출력 
		// 예) 10
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max : "+ max);
		System.out.println("\n------------------------------");

		// 문제 5) 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1)  {
				cnt++;
			}
		}
		System.out.println("홀수의 개수 : "+ cnt+"개");
    	System.out.println("\n------------------------------");
			
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0 , 0 , 5 , 3 , 1}
		int[] b = {0,0,0,0,0};
		for (int i = 0; i < a.length; i++) {
			if(a[i]% 2 == 1 ) {// 홀수인 경우이면
				b[i] = a[i];
			}
		//		for (int list : b) {
//			System.out.print("b => {"+list+"}");
     	}
		 System.out.println(Arrays.toString(b));
		 System.out.println("\n------------------------------");
		// 문제 7)  a의 값중 홀수만 c에 저장(저장위치는 앞에서부터 저장)
		// 예) c => {5, 3, 1, 0, 0}
		int[] c = { 0 , 0 , 0 , 0 , 0 };
		
		int cInx = 0; // 배열 c에 값을 저장할 인덱스 cIdx 변수 선언
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {//홀수만 거르기
				c[cInx] = a[i];// a[2] = c[0]  a[3] = c[1]
				cInx++;
			}
		}
		System.out.println(Arrays.toString(c));
		 System.out.println("\n------------------------------");
		
		
		}
	}

		
	


