package Array;

import java.util.Scanner;

public class boj13300_RoomAssignment {

    static int N; // 수학여행에 참가하는 학생 수
    static int K; // 한 방에 배정할 수 있는 최대 인원 수
    static int[][] student; // 학생 입력

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 수학여행에 참가하는 학생 수
        K = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원 수
        student = new int[7][2];
        for (int i = 0; i < N; i++) {
            int sex = sc.nextInt(); // 성별 입력 여학생은 0, 남학생은 1
            // 여학생이면 0번 인덱스에 학년만큼 1씩 증가
            if (sex == 0) student[sc.nextInt()][0]++;
            // 남학생이면 0번 인덱스에 학년만큼 1씩 증가
            else if (sex == 1) student[sc.nextInt()][1]++;
        }
        int count = 0; // 방의 개수
        //여학생 탐색
        for (int i = 1; i < 7; i++) {
            //학생 수가 없다면 처음으로
            if (student[i][0] == 0) continue;
            //K보다 작거나 같으면 count 1 증가
            else if (student[i][0] <= K) count++;
            //K로 나눴는데 나머지가 0이라면 몫만큼 count 증가
            else if (student[i][0] % K == 0) count += student[i][0] / K;
            //K로 나눴는데 나머지가 0이아니라면 몫만큼 증가하고, 1증가
            else if (student[i][0] % K != 0) {
                count += student[i][0] / K;
                count++;
            }
        }
        //남학생 탐색
        for (int i = 1; i < 7; i++) {
            //학생 수가 없다면 처음으로
            if (student[i][1] == 0) continue;
            //K보다 작거나 같으면 count 1 증가
            else if (student[i][1] <= K) count++;
            //K로 나눴는데 나머지가 0이라면 몫만큼 count 증가
            else if (student[i][1] % K == 0) count += student[i][1] / K;
            //K로 나눴는데 나머지가 0이아니라면 몫만큼 증가하고, 1증가
            else if (student[i][1] % K != 0) {
                count += student[i][1] / K;
                count++;
            }
        }
        //count 출력
        System.out.println(count);
    }
}