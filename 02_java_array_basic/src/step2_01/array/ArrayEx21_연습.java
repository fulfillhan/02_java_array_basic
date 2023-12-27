package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx21_연습 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int elementCnt = 5;
		int selectMenu = 0;

		while (true) {
			System.out.println(Arrays.toString(arr));
			System.out.println();

			System.out.print("[1]삭제\n[0]종료\n");
			System.out.print("메뉴 선택 : ");
			int sel = scanner.nextInt();

			if (sel == 1) {

				System.out.print("삭제할 데이터 입력 : ");
				int data = scanner.nextInt();
				int delIdx = -1;
				for (int i = 0; i < elementCnt; i++) {
					if (arr[i] == data) {
						delIdx = i;
					}
				}
				if (delIdx == -1) {
					System.out.println("데이터를 재확인 해주세요!\n");
				}
				else {
					//삭제 배열 찾기- 삭제하는 위치에서부터 마지막위치값 전까지만
					for (int i = delIdx; i < elementCnt-1 ; i++) {
						arr[i] = arr[i+1];//값이 앞으로 이동
					}
					elementCnt--;
					arr[elementCnt] = 0;//맨 뒤에 있는 값은 0으로
				}
			} else if (sel == 0) {
				System.out.println("==종료==");
				break;
			}

		}
	}

}
