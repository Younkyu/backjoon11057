package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        long[] arr = new long[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for(int i = 1; i < input; i++) {
            for (int j = 9; j >= 0; j--) {
                for(int k = j + 1; k < 10; k++) {
                    arr[k] = (arr[k] + arr[j]) % 10007;
                }
            }
        }

        long result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (arr[i]);
        }

        System.out.println(result % 10007);
    }
}
