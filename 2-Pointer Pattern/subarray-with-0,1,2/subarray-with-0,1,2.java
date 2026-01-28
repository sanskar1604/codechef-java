package org.example.twoPointer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codechef1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        long result = 0;

        for (int right = 0; right < n; right++) {
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            // shrink from left while window contains all 3 numbers
            while (freq.size() == 3) { // all numbers present
                // All subarrays starting at left and ending >= right
                result += (n - right);

                // remove arr[left] from window
                freq.put(arr[left], freq.get(arr[left]) - 1);
                if (freq.get(arr[left]) == 0) {
                    freq.remove(arr[left]);
                }
                left++;
            }
        }

        System.out.println(result);
    }
}
