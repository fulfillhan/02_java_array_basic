package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

//2023-12-26
public class ArrayEx20_연습 {
	//-> 여기서부터 시작!
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2; //현재 요소의 개수
		int insertIdx = 0;
		int insertData = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));//문자열화
			
			System.out.println("[1] 삽입");
			System.out.println("[0] 종료");
			System.out.print("메뉴 선택 : ");
			int sel = scanner.nextInt();
			
			if (sel == 1) {
				System.out.print("삽입할 위치 입력 : ");
				insertData = scanner.nextInt();
				
				System.out.print("사입할 데이터 입력 : ");
				insertData = scanner.nextInt();
				
				//배열의 데이터 삽입
				//범위 정하기
				//->여기서 부터 다시하기
				if (insertIdx >= 0 && insertIdx <= elementCnt && elementCnt < arr.length) {
					// 배열의 요소를 오른쪽으로 이동시키기
					for (int i = elementCnt; i < insertIdx; i--) {
						arr[i] = arr[i - 1];
					}
					arr[insertIdx] = insertData;
					elementCnt++;
				} else {
					//삽입 불가능한 조건일 경우
					if (elementCnt >= arr.length) {
						System.out.println("길이를 초과합니다!");
						
					}else {
						System.out.println("올바른 삽입 위치를 선택하세요!");
					}
				}

			}

		}
	}

}
