class Solution {
    public int removeDuplicates(int[] nums) {
        int sp = 0;
        int fp = 0;
        for(fp = 0; fp < nums.length; fp++){
            if(nums[fp] != nums[sp]){
                sp++;
                nums[sp] = nums[fp];
            }
        }
        return sp+1;
    }
}