class Solution {
    public int maxSubArray(int[] nums) { 
                //Kadane's Algorithm....Time Complexity: O(n) Space Complexity: O(1)
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxSum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;
    }
}

                    //TIme Optimized Approach....Time Complexity: O(n^2) Space Complexity: O(1)
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        // return maxSum;



                    //Brute Force....Time Complexity: O(n^3) Space Complexity: O(1)
        // int maxSum = Integer.MIN_VALUE;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i; j < nums.length; j++){
        //         int sum = 0;
        //         for(int k = i; k <= j; k++){
        //             sum += nums[k];
        //         }
        //         maxSum = Math.max(maxSum, sum);
        //     }
        // }
        // return maxSum;