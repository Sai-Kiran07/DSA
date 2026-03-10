class Solution {
    public boolean check(int[] nums) {
        int drop = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[(i + 1) % nums.length]){
                drop++;
            }
        }
        if(drop == 0 || drop == 1) return true;
        // if(drop == 1 && nums[nums.length - 1] <= nums[0]) return true;
        return false;
    }
} 