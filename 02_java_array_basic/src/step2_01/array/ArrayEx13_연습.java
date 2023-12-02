package step2_01.array;
//2023-12-01
/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp배열로 이관하여보시오.
 * 
 */
import java.util.Arrays;

public class ArrayEx13_연습 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int cnt = 0; // 크기를 알아야함
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {  // 4의 배수가 참이면
				cnt++;
			}
			
		}
		//4의 배수 크기많큼 temp 배열 생성
		temp = new int[cnt];
		int j = 0;  // temp 배열에 값을 넣었을 때 사용할 인덱스 변수
		
	 for (int i = 0; i < arr.length; i++) {
		if (arr[i] % 4 == 0 ) {
			temp[j] = arr[i];
			System.out.print(temp[j]+ " ");
			j++;
			
		}
		 
	}
	 
	// System.out.print(Arrays.toString(temp));
	
		
	}
	
}
