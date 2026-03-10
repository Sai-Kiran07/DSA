class Solution {
    public void moveZeroes(int[] nums) {
        int temp[] = new int[nums.length];
        int numPointer = 0;
        int zeroPointer = nums.length-1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) temp[zeroPointer--] = nums[i];
            else temp[numPointer++] = nums[i];
        }
        for(int k = 0; k < temp.length; k++) nums[k] = temp[k];
    }
}