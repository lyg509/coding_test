package Array;

import java.util.Scanner;

import static java.lang.String.valueOf;

public class boj1475_RoomNumber {

    static int arr[] = new int[10];
    static int cnt = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String N = scan.nextLine(); // N을 string으로 저장
        int number[] = new int[N.length()]; // N의 길이만큼 배열 생성

        for (int i = 0; i < N.length(); i++) {
            number[i] = N.charAt(i) - '0'; //number배열에 한글자씩 정수로 저장
        }
        for (int i = 0; i < N.length(); i++) {
            if (arr[number[i]] == 0) {
                if (number[i] == 6 && arr[9] != 0) { // 6이 없는데 9가 있을 때
                    arr[9] -= 1;
                    continue;
                } else if (number[i] == 9 && arr[6] != 0) { // 9가 없는데 6이 있을 때
                    arr[6] -= 1;
                    continue;
                } else {
                    for (int j = 0; j < 10; j++) {
                        arr[j] += 1; // set 증가
                    }
                    cnt++; // set 카운트
                    arr[number[i]] -= 1; // 해당 값 개수 감소
                }
            } else {
                arr[number[i]] -= 1;
            }
        }
        System.out.println(cnt);

        scan.close();
    }
}