package Array;

import java.util.Arrays;
import java.util.Scanner;

public class boj10808_TheNumberOfAlphabets {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int [] arr = new int[26];

        for(int i=0; i<arr.length; i++) {
            arr[i] = 0;
        }
        String S = sc.next();

        int count = 0;
        for(char ch : S.toCharArray()) {
            int idx = (int) ch - 'a';
            arr[idx]++;
        }

        String result = Arrays.toString(arr);
        System.out.println(result.substring(1,result.length()-1).replace(",", ""));
    }
}