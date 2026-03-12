class Solution {
    public int removeDuplicates(int[] nums) {
        int sp = 0;
        for(int fp = 0;fp < nums.length; fp++){
            if(sp < 2 || nums[fp] != nums[sp - 2]){
                    nums[sp] = nums[fp];
                    sp++;
                }
            }
        return sp;
    }
}