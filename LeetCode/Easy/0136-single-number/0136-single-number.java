import java.util.Map;
import java.util.HashMap;
class Solution {
    public int singleNumber(int[] nums) {
        int occurence = 0;
        for(int i = 0; i < nums.length; i++){
            occurence = 0;
            for(int j = 0;j < nums.length;j++){
                if(nums[j] == nums[i]) occurence++ ;
            }
            if(occurence == 1) return nums[i];
        }
        return -1;
    }
}