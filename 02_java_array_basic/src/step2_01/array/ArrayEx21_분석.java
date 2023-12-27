package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

// 삭제 한 후 뒤에 값들이 앞으로 댕겨와서 뒤에 값들이 0이 된다.
/*
 * # 배열 컨트롤러[1단계] : 삭제
 * 
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */



public class ArrayEx21_분석 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10, 20, 30, 40, 50};
		int elementCnt = 5;
		int selectMenu = 0;
		
		while (true) {
			
			System.out.println(Arrays.toString(arr));
			System.out.println();

			System.out.println("[1]삭제");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				
				System.out.print("삭제할 값 입력 : ");
				int data = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == data) { // 10,20,30,40,50   < 30
						delIdx = i;
					}
				}
				
				if (delIdx == -1) {//(delIdx <= -1|| delIdx > 4) {
					System.out.println("입력하신 값은 존재하지 않습니다.");
				} 
				else {
					for (int i = delIdx; i < elementCnt - 1; i++) {
						arr[i] = arr[i+1];//arr[3] = arr[4]
					} //  // 10,40,50,0,0 
					elementCnt--;
					arr[elementCnt] = 0; //배열 뒤에 값들을 0으로 만들기
				}
				
			}
			else if (selectMenu == 0) {
				scan.close();
				break;
			}

		}
		
	}
		
}


