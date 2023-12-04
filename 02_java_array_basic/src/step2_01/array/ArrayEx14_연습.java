package step2_01.array;
//2023-12-02

import java.util.Scanner;


/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 */

public class ArrayEx14_연습 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int playerIdx = 0;
		
		 //player의 위치 찾기 -> 배열을 순회하여 2가 있는 위치를 찾아 playerIdx변수에 저장한다.
		for (int i = 0; i < game.length; i++) {
			if (game[i] == 2) {
				playerIdx = i;                     
			}
		}
		//게임 루프 시작
		while (true) {
			
			System.out.print("[");
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 2) {
					System.out.print("옷");
				}
				else if (game[i] == 0) {
					System.out.print("-");
				}
			}
			System.out.println("]"+"\n");
		
			System.out.print("왼쪽[1] 오른쪽[2]  종료[3]입력: ");
			int sel = scan.nextInt();
			
			// 사용자의 입력에 따라 player 의 이동 로직 
			//왼쪽으로 이동
			if (sel == 1) {
				if (playerIdx != 0) {             //  위치 = player, 0의 위치가 아니다가 true면
					game[playerIdx] = 0;          // 왼쪽으로 이동하니깐, 원래값은 0으로 저장
					game[playerIdx-1] = 2;        // -1의 왼쪽줄 이동하여 2로 저장
					playerIdx--;                  // 위치값은 한자리씩 마이너스
				}
				
			}
			//오른쪽으로 이동
			else if (sel == 2) {
				if (playerIdx != game.length -1) { //game.length -1 : 끝자리가 아니면
					game[playerIdx] = 0;
					game[playerIdx+1] = 2;
					playerIdx++;                   // 위치값은 한자리씩 플러스
				}
			}
			//종료하기
			else if (sel ==3) {
				System.out.println("프로그램 종료");
				break;
				}
			
			}
		scan.close();
		
	}
}
