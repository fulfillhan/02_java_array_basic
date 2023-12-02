package step2_01.array;
//2023-12-01
// 값 교체하기
// 느낀점 -> 교체할 때 인덱스 or요소 어떤 기준으로 하는지에 따라 소스의 과정이 달라진다. 잘 구별해서 할것!
import java.util.Iterator;
import java.util.Scanner;



public class ArrayEx12_연습 {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
				// 예    1) 인덱스1 입력 : 1
				//		   인덱스2 입력 : 3
				//		  {10, 40, 30, 20, 50}
		
		
		System.out.print("인덱스1 입력 : ");
		int idx01 = scanner.nextInt();
		System.out.print("인덱스2 입력 : ");
		int idx02 = scanner.nextInt();
		
		// 인덱스를 기준으로 배열의 요소만 서로 교체 하는 코드
		int temp = arr [idx01];    // idx01의 요소를 temp변수에 저장(임시)
		arr[idx01] = arr[idx02];  // idx01의 자리에 idx02의 요소를 저장한다.
		arr[idx02]=temp;          // 기존에 temp에 저장된 요소를 idx02에 저장한다.
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();	
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//          값2 입력 : 50
		//		    {50, 20, 30, 40, 10}
	
	   //
	   System.out.print("값1 입력 : ");
	   int val01 = scanner.nextInt();
	   System.out.print("값2 입력 : ");
	   int val02 = scanner.nextInt();
	   
	   for (int i = 0; i < arr.length; i++) {
		if (arr[i] == val01) {      //arr[i]가 val01과 같으면
			arr[i] = val02;         // val02 가 arr[i]자리로 저장된다.
		}
		else if (arr[i] == val02) {
			arr[i] = val01;
		}
	}
	   for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	   System.out.println();

		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}

		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번1 입력 : ");
		int num1 = scanner.nextInt();
		System.out.print("학번2 입력 : ");
		int num2 = scanner.nextInt(); 
		
		//입력한 학번의 인덱스 기준으로 교체해야함
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i = 0; i < hakbuns.length; i++) {
			
			//조건식 = 내가 입력한 값이랑 arr[i]배열 순회하여 인덱스 값 구하기
			if (arr[i] == num1) {
				idx01 = i;
			}else if (arr[i] == num2) {
				idx02 = i;
			}
			
			//인덱스 값 구한후 해당 인덱스의 score 배열에서 교체하기
			temp = scores[idx01];
			scores[idx01] = scores[idx02];
			scores[idx02] = temp;
		}
		
	    for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i]+ " ");
    	}

	}
		
}


