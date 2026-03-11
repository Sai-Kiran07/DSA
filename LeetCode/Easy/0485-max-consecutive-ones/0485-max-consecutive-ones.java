class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sp = 0;
        int max = 0;
        for(int fp = 0; fp < nums.length; fp++){
            // if(nums[fp]==1 && nums[sp] == 0) sp = fp;
            if(nums[fp] == 1)
            {
                if(nums[sp] == 0) sp = fp;
                if(((fp - sp) + 1) > max) max = (fp - sp) + 1;
            }
            else{
                sp = fp;
            }
        }
        return max;
    }
}