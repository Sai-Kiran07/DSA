class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while(mid <= end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;

            }
        }
    }
    void swap(int[] nums, int pos1, int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}
