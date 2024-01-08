package step2_01.array;
//2023-01-05 다시 풀기

import java.util.Scanner;

public class ArrayEx14_연습2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int playerIdx = 0;

		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				playerIdx = i;
			}
		}
		while (true) {
			System.out.print("[ ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]+" ");
			}
			System.out.println("]");

			System.out.print("왼쪽[1] 오른쪽[2]  종료[3]입력: ");
			int move = scan.nextInt();

			if (move == 1) {// 캐릭터 왼쪽으로 이동 인덱스값 작아진다. 조건은 왼쪽끝에 있으면 안된다
				if (playerIdx != 0) {
					game[playerIdx] = 0;
					game[playerIdx - 1] = 2;
					playerIdx--;
				}
			} else if (move == 2) {
				if (playerIdx != playerIdx - 1) {
					game[playerIdx] = 0;
					game[playerIdx + 1] = 2;
					playerIdx++;
				}
			} else if (move == 3) {
				System.out.println("==시스템 종료==");
				scan.close();
				break;
			}

		}

	}

}
