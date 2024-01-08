package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_2_연습 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = {10, 20, 30, 40, 50};
		int[] e = {0, 0, 0, 0, 0};
		// 예) 30 ==> e = {10 , 20 , 40 , 50 , 0};
		
		System.out.print("내가 입력한 값 : ");
		int myNum = scan.nextInt();
		
		int myNumIdx = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] != myNum) {
				e[myNumIdx] = d[i];
				myNumIdx++;
			}
		}
		
		System.out.print("{ ");
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i]);
			if (i != e.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = {1001, 40, 1002, 65, 1003, 70};
		int[] g = {0, 0, 0, 0, 0, 0};
		// 예) 1002 ==> {1001 , 40 , 1003 , 70 , 0 , 0};
		
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		
		// 삭제할 값의 인덱스 찾기
		myNumIdx = 0;
		for (int i = 0; i < f.length; i++) {
			if (num == f[i]) {
				myNumIdx = i;
			}
		}
		//삭제하기 전까지의 데이터 배열에 저장하기
		for (int i = 0; i < myNumIdx; i++) {
			g[i] = f[i];
		}
		//삭제하는 인덱스부터 길이-2 전까지 조건
		for (int i = myNumIdx; i < f.length - 2; i++) {
			g[i] = f[i + 2];
		}
		System.out.print("{ ");
		for (int printG : g) {
			System.out.print(printG + " ");
		}
		System.out.println("}");
		
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = {10, 20, 30, 40, 50};
		// 예)  60 ==> {20 , 30 , 40 , 50 , 60};
		System.out.print("숫자 입력 : ");
		myNum = scan.nextInt();
		
		myNumIdx = 0;
		for (int i = 0; i < h.length - 1; i++) {
			if (myNum != h[i]) {
				h[i] = h[i + 1];
			}
		}
		h[h.length - 1] = myNum;
		
		System.out.print("{ ");
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i]);
			if (i != h.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = {10, 20, 30, 40, 50};
		// 예) 60 ==> {60 , 10 , 20 , 30 , 40};
		System.out.print("숫자 입력 : ");
		myNum = scan.nextInt();
		
		for (int j = i.length - 1; j > 0; j--) {
			i[j] = i[j - 1];
		}
		i[0] = myNum;
		
		System.out.print("{ ");
		for (int value : i) {
			System.out.print(value + " ");
		}
		System.out.println(" }");
		System.out.println();
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = {1, 2, 3, 4, 5};
		int[] k = {0, 0, 0, 0, 0};
		//예) k => {5 , 4 , 3 , 2 , 1};
		int arrIdx = 0;
		for (int l = j.length - 1; l >= 0; l--) {
			k[arrIdx] = j[l];
			arrIdx++;
		}
		System.out.print("{ ");
		for (int l = 0; l < k.length; l++) {
			System.out.print(k[l]);
			if (l != k.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		
	}
	
}
