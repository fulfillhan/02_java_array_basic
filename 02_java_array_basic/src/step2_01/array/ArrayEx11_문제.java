package step2_01.array;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 isFirst배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */


public class ArrayEx11_문제 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		
		boolean[] isFirst = new boolean[5];
		int[] arr   = new int[5];
		
 		for (int idx = 0; idx < 5; idx++) {
			
			int rNum = ran.nextInt(5);
			
			if (isFirst[rNum] == false) {// 중복될경우 idx 값이 올라가면 안됨
				isFirst[rNum] = true;
				arr[idx]= rNum;
			/*
			 * arr[0] =2 arr[1]=3 arr[1] = 0 arr[2]=2 arr[4] = 0
			 *  rNum 중복됨
			 */
			
			}
		}
		System.out.print("arr : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
					
	}
	
}
