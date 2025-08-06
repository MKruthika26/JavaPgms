package com.basic;

public class Demo {
	public static int minSubArrayLen(int k, int[] arr) {
        int minLength = Integer.MAX_VALUE;
        int left = 0, sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= k) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;
        int result = minSubArrayLen(k, arr);
        System.out.println("Minimum subarray length: " + result);
    }

}