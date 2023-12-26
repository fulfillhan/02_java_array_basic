package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 삽입
 * 
 * 데이터들 중간 사이에 새로운 데이터를 추가하는 것은 삽입이라고 한다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx20_분석 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10 , 20 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0};
		int elementCnt = 0;
		int selectMenu = 0;
		int index = 0;
		int data = 0;
		
		while (true) {//무한 반복
			
			System.out.println(Arrays.toString(arr));//문자열화 출력
			
			System.out.println("[1]삽입");
			System.out.println("[0]종료");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {//삽입할 시
				
				if (elementCnt == arr.length) {//배열의 길이와 같다면
					System.out.println("더 이상 삽입할 수 없습니다.");
					continue;
				}
				
				System.out.print("삽입할 위치 입력 : ");
				index = scan.nextInt();	//if 값 사용해서 범위 정하기
				if (index < 0 || index > elementCnt) {
					System.out.println("이 위치에 입력할 수 없습니다.");
				}
				
				System.out.print("삽입할 값 입력 : ");
				data = scan.nextInt();//배열을 통해서 삽입할 값 들어가게끔 해야한다
				
			}
			else {//selelctMenu == 0
				scan.close();
				break;
			}
			
				
			
		}


	}
}
