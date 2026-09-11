class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;
        if(nums.length == 0) return -1;
        if(nums.length == 1){
            if(nums[0] == target) return 0;
            else return -1;
        }
        for(int i = 0 ; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                idx = searchInRotatedPart(nums,target,0,i);
                if(idx > -1) return idx;
                idx = searchInRotatedPart(nums,target,i + 1,nums.length - 1);
                return idx;
            }
        }
        idx = searchInRotatedPart(nums,target,0,nums.length - 1);
        return idx;
    }
    public int searchInRotatedPart(int[] nums, int target, int low, int high){
        while(high >= low){
            int mid = (high + low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}