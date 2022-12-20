package Array;

import java.util.Scanner;

public class boj11328_Strfry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            int[] alphabet = new int[26];
            boolean check = true;

            char[] words1 = sc.next().toCharArray();
            char[] words2 = sc.next().toCharArray();
            for (char c : words1) alphabet[c - 97]++;
            for (char c : words2) alphabet[c - 97]--;
            for (int j : alphabet)
                if (j != 0) check = false;
            System.out.println(check ? "Possible" : "Impossible");
        }
    }
}
