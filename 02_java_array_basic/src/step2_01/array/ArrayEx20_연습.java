package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

//2023-12-26
public class ArrayEx20_연습 {
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2; //현재 요소의 개수
		
		
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));//문자열화
			
			System.out.println("[1] 삽입");
			System.out.println("[0] 종료");
			System.out.print("메뉴 선택 : ");
			int sel = scanner.nextInt();
			
			if (sel == 1) {
				
				if (elementCnt >= arr.length) {
					System.out.println("크기를 벗어납니다!");
					continue;
				}
				System.out.print("삽입할 위치 입력 : ");
				int insertIdx = scanner.nextInt();
				
				System.out.print("삽입할 데이터 입력 : ");
				int insertData = scanner.nextInt();
				
				//배열의 데이터 삽입
				//범위 정하기
				
				if (insertIdx >= 0 && insertIdx <= elementCnt) {
					// 배열의 요소를 오른쪽으로 이동시키기
					for (int i = elementCnt; i > insertIdx; i--) {
						arr[i] = arr[i - 1];
					}
					arr[insertIdx] = insertData;
					elementCnt++;
				} else {
					System.out.println("올바른 삽입 위치를 선택하세요!");
					continue;
				}
			}else {
				System.out.println("==시스템 종료==");
				scanner.close();
				break;
			}

		}
	}

}
