class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint = -1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]) 
            {
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1){
            reverse(nums,0,nums.length - 1);
            return;
        }

        for(int i = nums.length - 1; i >= breakpoint; i--){
            if(nums[i] > nums[breakpoint]){
                int temp = nums[i];
                nums[i] = nums[breakpoint];
                nums[breakpoint] = temp;
                break;
            }
        }

        reverse(nums, breakpoint + 1, nums.length - 1);
    }
    public static void reverse(int[] nums, int start, int end) {

    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}