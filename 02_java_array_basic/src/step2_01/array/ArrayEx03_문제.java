package step2_01.array;

/*
 * # 배열 기본문제
 */

public class ArrayEx03_문제 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i+1)* 10;
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n"); //>  한줄 개행
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				System.out.print(arr[i]+ " ");
			} 
		}
		System.out.println("\n");
		
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				total += arr[i];
			}
		}
		System.out.println(total);
		System.out.println();
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 ==0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		System.out.println();
		
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
}
