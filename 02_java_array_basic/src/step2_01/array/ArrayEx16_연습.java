package step2_01.array;
//2023-12-07
/*
 * # 1 to 50[1단계] : 1 to 4
 *
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.

 * 예)
 * [ 4 2 3 1 ]
 *
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 *
 * 코드 종료
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx16_연습 {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[4];
        boolean[] isCheck = new boolean[4];

        int i = 0;
        while (i < arr.length) {

            int randIdx = ran.nextInt(4); // 인덱스값으로 0~3 렌덤숫자 지정

            if (!isCheck[randIdx]) { // !isCheck[r] 해당 인덱스r의 값이 아직 사용되고 있지 않을때
                isCheck[randIdx] = true;
                arr[i] = randIdx + 1;
                i++;
            }
        }
        int element = 1;
        int j = 0;
        while (j < arr.length) {

            System.out.println(Arrays.toString(arr));
            System.out.println();

            System.out.print("입력 : ");
            int idx = scan.nextInt();

            if (arr[idx] == element) {
                arr[idx] = 9;
                element++;
                j++;
            }
        }
        scan.close();


    }

}
