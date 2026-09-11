class Solution {
    public boolean search(int[] nums, int target) {
        boolean result = false;
        if(nums.length == 0) return result;
        if(nums.length == 1){
            if(nums[0] == target) return true;
            else return false;
        }
        if(nums.length == 2){
            if(nums[0] == nums[1] && nums[0] == target) return true;
        }
        for(int i = 0;i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                result = searchInRotated(nums, target, 0, i);
                if(result) return true;
                result = searchInRotated(nums, target, i + 1 , nums.length - 1);
                if(result) return true;
                break;
            }
        }
        result = searchInRotated(nums, target, 0, nums.length - 1);
        return result;
    }
    public boolean searchInRotated(int[] nums, int target, int low, int high){
        while(high >= low){
            int mid = (high + low) / 2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return false;
    }
}