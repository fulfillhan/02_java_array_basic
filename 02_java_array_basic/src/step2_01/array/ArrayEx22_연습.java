package step2_01.array;
//2023-12-27 
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;


/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  19번 20번 21번의 문제를 한 코드로 병합하여 보세요.
 * 
 * 1) 추가
 * 2) 삽입
 * 3) 삭제
 * 
 *  정답 없음
 */


public class ArrayEx22_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 2;// 현재 배열에 존재하는 원소의 갯수
		int selectMenu = 0;
		
		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.println("\n1추가");
			System.out.println("2삽입");
			System.out.println("3삭제");
			System.out.println("4종료\n");
			
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				if (elementCnt >= arr.length) {
					System.out.println("배열의 크기를 넘어갑니다!");
					continue;
				}
				
				System.out.print("추가할 데이터 입력 : ");
				int addData = scan.nextInt();
				
				//배열의 끝에 데이터 추가
				arr[elementCnt] = addData;
				elementCnt++;
				
			}else if (selectMenu == 2) {
				
				if (elementCnt > arr.length) {
					System.out.println("배열의 길이를 넘어갑니다!");
					continue;
				}
				System.out.print("삽입할 위치 입력 : ");
				int idx = scan.nextInt();
				
				
				//삽입할 위치의 범위 정해주기
				if (idx < 0 || idx >= arr.length) {
					System.out.println("해당 위치에 삽입할 수 없습니다!\n");
					continue;
				}
				
				System.out.print("삽입할 데이터 입력 : ");
				int insertData = scan.nextInt();
				
				
				for (int i = elementCnt; i < idx; i--) {// 배열에 존재하는 원소의 개수에서 삽입할 위치까지 
					arr[i] = arr[i-1];// 한칸식 오른쪽으로 빼기					
				}
				arr[idx] = insertData;
				elementCnt++;

				idx = -1;
				 System.out.print("삽입할 위치를 입력하세요 : ");
				 int myIdx = scan.nextInt();
				 System.out.print("삽입할 데이터를 입력하세요 : ");
				 int myData = scan.nextInt();
			}else if (selectMenu == 3) {
				//삭제하기
				System.out.print("삭제할 값 입력 : ");
				int delData = scan.nextInt();
				
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == delData) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("삭제할 값이 없습니다.");
					
				}else {
					for (int i = delIdx; i < elementCnt-1; i++) {
						arr[i]=arr[i+1];
					}
				}
				arr[elementCnt-1] = 0;
				elementCnt--;
				
			}else if(selectMenu == 4) {
				break;
			}
			
		}
		
	}
	
}
