package step2_01.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.naming.Context;
import javax.swing.text.GapContent;

public class ArrayEx24_테스트문제1_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74 , 82 , 0 , 0 , 0}
		int[] l = { 10 , 20 , 30 , 40 , 50 };
		int[] m = { 13 , 54 , 17 , 42 , 1 };
		int[] n = { 0 , 0 , 0 , 0 , 0};
		
		
		// l과 m을 비교하고 조건식을 짝수로 걸고, n에 순서대로 저장
		int j = 0;
		for (int i = 0; i < 5; i++) {
			int sum = l[i] + m[i];
			if(sum % 2 ==0 ) {
				n[j]= sum;
				j++;
			}
		}
		System.out.print("n = {");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i]);
			if(i < n.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("}");
		System.out.println();
	
		
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001 , 1002 , 1003 };
		int[] score = { 50 , 83 , 78 };
		int[] win = { 0 , 0 , 0 };
		// 예) win[3]= {1002 , 1003 , 0};
		j= 0;
		for (int i = 0; i <3; i++) {
			if(score[i] >= 60) {
				win[j] = num[i];
				j++;
			}
		}
		System.out.print("win[3] = {");
		for (int i = 0; i < win.length; i++) {
			System.out.print(win[i]);
			if(i < win.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// 문제 15) 아래는 시험결과이다. 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001 , 80 , 1002 , 23, 1003 , 78 };
		int[] win2 = { 0 , 0 , 0 };
		// 예) win2[3] = {1001 , 1003 , 0};
		 j = 0;
		
	   // 숫자와 시험점수를 나눈다
		for (int i = 0; i < data.length; i += 2) {
			int number = data[i];
			int score02 = data[i+1];
			
			if(score02 >= 60 && j < win2.length) {
				win2[j] = number;
				j++;
			}
		}
		System.out.print("win[3] = {");
		for (int i = 0; i < win2.length; i++) {
			System.out.print(win2[i]);
			if(i <  win2.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("}");
		System.out.println();
		
	
		// 문제 16) 아래 배열o 에서 내가 입력한 값만 빼고 p배열에 저장 
		int[] o = { 10 , 20 , 30 , 40 , 50 };
		int[] p = { 0 , 0 , 0 , 0 , 0 };
		// 예) 30 ==> p = {10 , 20 , 40 , 50 , 0};
		System.out.print("숫자 입력 : ");
		int myNum = scan.nextInt();
		
		j = 0;
		for (int i = 0; i < p.length; i++) {
			if(o[i] != myNum) {
				p[j] = o[i];
				j++;
			}
		}
		System.out.print("p = {");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i]);
			if(i < p.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호와 값만 빼고 다른 번호와 값을 r 에 저장 
		int[] q = { 1001 , 40 , 1002 , 65 , 1003 , 70 };
		int[] r = { 0 , 0 , 0 , 0 , 0 , 0 };
		// 예) 1002 ==> r = {1001 , 40 , 1003 , 70 , 0 , 0};
		System.out.print("번호 입력 : ");
		myNum = scan.nextInt();
		j = 0;
		for (int i = 0; i < r.length; i +=2) {
			int number = q[i];
			int data2 = q[i+1];
			if(myNum != number ) {
				 r[j] = number;
				 r[j+1]=data2;
				 j++;
			}
			
		}
		System.out.print("r = {");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]);
			if(i < r.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		// 문제 18) 
		int[] arr = {10 , 20 , 30 , 40 , 50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		
		int i = 0;
		while(i < arr.length) {
			
			System.out.print("숫자 입력 : ");
			myNum = scan.nextInt();
			
			//입력한 값이 해당 배열에 있는지 여부
			boolean isFound = false;
			for (int idx = 0; idx < arr.length; idx++) {
				if(arr[idx] == myNum) {
					isFound = true;
					s[i] = idx;
					break;
				}
			}
			if(!isFound) {
				s[i] = -1;
			}
			i++;
		}
		for (int k = 0; k < s.length; k++) {
			System.out.print(s[k]+ " ");
		}
		
	}

}


