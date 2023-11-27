package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;


/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 'O'로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 *  예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [O] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3m
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [O] [X] [O] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

public class ArrayEx09_연습 {
	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X', 'X', 'X', 'X', 'X', 'X', 'X'};
		//int getSeat = 0;
		int totalMoney = 0;
		int ticketingCnt = 0;
		
		while (true) {
			
			System.out.println("\n------------- CGV ----------\n");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print("[" + seat[i]+ "] ");
			}
			System.out.println("\n");
			
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			System.out.print("번호 선택[1,2번중] : ");
			int mySel = scan.nextInt();
			
			
			//좌석 선택(1~7) : 2(입력받기)
			if (mySel == 1) {
				System.out.print("좌석선택(1~7) : ");
				int mySeatIdx = scan.nextInt()-1;
				
			    // 다른 좌석을 입력했을때
				if (mySeatIdx < 0 || seat.length -1 < mySeatIdx) {
					System.out.println("1~7까지의 좌석을 선택하여 주십시요.");
					continue;//해당조건 빠져나고 다시 위로 올라감
				}
				if (seat[mySeatIdx] == 'X') {
					seat[mySeatIdx] = 'o';
					ticketingCnt++;
					totalMoney = ticketingCnt * 12000;
				}
				else {
					System.out.println(" 이미 예매가 완료 되었습니다.");
				}
				
			}//매출액이 나와야함
			else if (mySel == 2) {
				System.out.println(" ---------------------- ");
				System.out.println("매출액 : " + totalMoney+ "원");
				System.out.println("== 종료 ==");
				
				scan.close();
				break;
			}
			else {
				System.out.println("1~2중에 선택하세요.");
			}
		}
		
	}
	

}
