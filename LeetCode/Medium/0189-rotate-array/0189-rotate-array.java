class Solution {
    public void rotate(int[] nums, int k) {
        //O(1) space.
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        // int[] temp = new int[nums.length];
        // for(int i = 0;i < nums.length; i++){
        //     temp[(i+k) % nums.length] = nums[i];
        // }
        // for(int i = 0;i < temp.length;i++){
        //     nums[i] = temp[i];
        // }
    }
    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; end--;
        }
    }
}
       