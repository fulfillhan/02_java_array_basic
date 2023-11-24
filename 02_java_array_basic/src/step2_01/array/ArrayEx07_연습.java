package step2_01.array;
//2023-11-24 09:50 ~10:02

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */


public class ArrayEx07_연습 {
	
public static void main(String[] args) {
		
		int[] stduentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		int firstScore = 0;//1등 학생의 점수
		int firstNum= 0;//1등 학생의 번호의 
		
		for (int i = 0; i < scores.length; i++) {
			if (firstScore < scores[i]) {
				firstScore = scores[i];
				firstNum = stduentNums[i];
			}
		}
		System.out.println(firstNum + "번("+firstScore+"점)");
	}
}
