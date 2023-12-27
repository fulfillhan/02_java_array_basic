package step2_01.array;
//2023-12-27 
import java.util.Scanner;


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
		int elementCnt = 2;
		int selectMenu = 0;
		
		while (true) {
			
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
				System.out.print("추가할 위치 입력 : ");
				int addData = scan.nextInt();
				
				arr[elementCnt] = addData;
				elementCnt++;
				
			}else if (selectMenu == 2) {
				
				int idx = -1;
				 System.out.print("삽입할 위치를 입력하세요 : ");
				 int myIdx = scan.nextInt();
				 System.out.print("삽입할 데이터를 입력하세요 : ");
				 int myData = scan.nextInt();
				 
				
				 
				
			}else if (selectMenu == 3) {
				
			}else if(selectMenu == 4) {
				break;
			}
			
		}
		
	}
	
}
