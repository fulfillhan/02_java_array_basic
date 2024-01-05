package step2_01.array;
//2023-01-05 다시 풀기

import java.util.Scanner;

public class ArrayEx14_연습2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int playerIdx = 0;
		
		for (int i = 0; i < game.length; i++) {
			if(game[i] == 2) {
				playerIdx = i;
			}
		}
		while(true) {
			
			for (int runGame : game) {
				System.out.println(runGame);
			}
			
			System.out.println("왼쪽[1] 오른쪽[2]  종료[3]입력: ");
			int sel = scan.nextInt();
			
			// 사용자의 입력에 따라 변경로직 만들어주기
//			if(sle) {
//				
//			}
			
			
		}
		
	}

}
