package step2_01.array;
import java.util.Arrays;
import java.util.Iterator;
//2023-12-29
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */


public class ArrayEx23_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println(Arrays.toString(accs));
			System.out.println(Arrays.toString(pws));
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();

			if (selectMenu == 1) {

				if (accsCnt >= accs.length) {
					System.out.println("[경고] 더이상 계좌를 만들 수 없습니다!");
				}

				System.out.print("계좌 번호를 입력하세요 : ");
				int myAccs = scan.nextInt();

				// 중복여부를 boolean값으로 설정
				boolean checkIdx = false;
				for (int i = 0; i < accsCnt; i++) {
					if (myAccs == accs[i]) {
						checkIdx = true;
						break;
					}
				}

				if (checkIdx) {
					System.out.println("[경고] 아이디가 중복됩니다!");
				}

				else {
					System.out.print("패스워드를 입력하세요 : ");
					int myPw = scan.nextInt();

					accs[accsCnt] = myAccs;
					pws[accsCnt] = myPw;

					for (int i = 0; i < accsCnt; i++) {
						if (myAccs != accs[i] && myPw != pws[i]) {// 기존배열에 없는 id,pw 들어와야지만
							System.out.println("가입 완료!\n");// 가입 완료
							break;
						} else {
							System.out.println("아이디와 패스워드를 재확인 해주세요");
						}
					}
					accsCnt++;
				}
			}
			else if (selectMenu == 2) {


				System.out.print("탈퇴할 계좌번호를 입력하세요 : ");
				int myAccNumber = scan.nextInt();


				//중복확인을 하여 중복되면 해당 계좌번호 보유 -> 탈퇴 가능
				int delIdx = -1;
				for (int i = 0; i < accsCnt; i++) {
					if (myAccNumber == accs[i]){
						delIdx = i;
						break;
					}
				}
				if (delIdx == -1){
					System.out.println("[경고] 아이디를 재확인 해주세요!");
				}
				else { // 아이디를 보유하고 있다면
					System.out.print("계좌 번호를 입력하세요 : ");
					int myPw = scan.nextInt();
					
					for (int i = delIdx; i < accsCnt-1; i++) {
						accs[i] = accs[i+1];
						pws[i] = accs[i+1];
					}
					accsCnt--;
					System.out.println("탈퇴 완료!\n");
					accs[accsCnt]=0;
					pws[accsCnt] =0;
				}
			}
			else if (selectMenu == 3) {
				System.out.println("==시스템 종료==");
				scan.close();
				break;
			}
			
		}

	}
}
