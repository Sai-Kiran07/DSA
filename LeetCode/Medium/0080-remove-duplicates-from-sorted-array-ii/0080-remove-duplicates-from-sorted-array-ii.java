class Solution {
    public int removeDuplicates(int[] nums) {
        int sp = 2;
        for(int fp = 2;fp < nums.length; fp++){
            if(nums[fp] != nums[sp - 2]){
                    nums[sp] = nums[fp];
                    sp++;
                }
            }
        return sp;
    }
}