package step2_01.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

// 2023-11-24  12:34 ~ 13:00 
// 헷갈렸던 부분 : 정오표 배열을 만드는 부분에서 오래 걸림..
/*
 * # OMR카드
 * 
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * -> 정오표의 배열을 만들어본다.
 * 예)
 * answer  = {1, 3, 4, 2, 5}
 * hgd     = {1, 1, 4, 4, 3}
 * 정오표  = {O, X, O, X, X}
 * 성적    = 40점
 */

public class ArrayEx08_연습 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		char[] mark = new char[5];
		int scoreCnt = 0;
		int totalScore = 0;
		
		// hgd에 1~5 사이의 랜덤 숫자 5개를 저장
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = random.nextInt(5)+1;
		}
		
		//answer와 hgd 값을 비교해 정오표를 출력
		for (int i = 0; i < hgd.length; i++) {
			if (answer[i] == hgd[i]) {
				mark[i] = 'O';
				scoreCnt++;
				totalScore = scoreCnt * 20;
				
			}else {
				mark[i]= 'X';
				}
			}
		
		//System.out.println("answer  = "+ Arrays.toString(answer));
		System.out.print("answer  = ");
		for (int i = 0; i < answer.length; i++) {
			System.out.print(""+answer[i]+ " ");
		}
		System.out.println();
		
		//System.out.println("hgd     = "+ Arrays.toString(hgd));
		System.out.print("hgd     = ");
		for (int i = 0; i < hgd.length; i++) {
			System.out.print(hgd[i]+ " ");
		}
		System.out.println();
		
		//System.out.println("정오표  = "+ Arrays.toString(mark));
		System.out.print("정오표  = ");
		for (int i = 0; i < mark.length; i++) {
			System.out.print(mark[i]+ " ");
		}
		System.out.println();
		
		System.out.println("성적    = "+ totalScore+ "점");
	}
}
