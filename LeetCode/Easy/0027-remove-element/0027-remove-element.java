class Solution {
    public int removeElement(int[] nums, int val) {
        int sp = 0;
        for(int fp = 0; fp < nums.length; fp++){
            if(nums[fp] != val){
                nums[sp] = nums[fp];
                sp++;
            }
        }
        return sp;
    }
}