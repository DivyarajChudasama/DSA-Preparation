//Max Consecutive Ones
// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

import java.util.*;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
    }
}

