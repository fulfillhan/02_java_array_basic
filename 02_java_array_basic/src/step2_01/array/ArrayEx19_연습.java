package step2_01.array;
//2023-12-25
import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 추가
 * 
 * 프로그래밍에서 데이터의 추가는 가장 끝 (마지막)에하는 것이 일반적인 정책이다.
 * 정답을 보고 소스를 동작을 해본뒤에 소스를 이해하고 코드를 작성해보자.
 * 
 */

public class ArrayEx19_연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 0, 0, 0, 0, 0, 0, 0, 0 };
		int elementCnt = 2;

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.println();

			System.out.println("[1]추가");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {

				System.out.print("추가할 값 입력 : ");
				int myNum = scan.nextInt();
				
				if(elementCnt >= arr.length) {// element 9까지이고 배열의 길이는 10
					// 배열의 길이인 10이상이 되면
					System.out.println("더 이상 추가 할 수 없습니다.");
					continue;
				}
				
				arr[elementCnt] = myNum;
				elementCnt++;

			} else if (selectMenu == 0) {
				System.out.println("종료");
				break;
			}
		}
		scan.close();
	}

}
