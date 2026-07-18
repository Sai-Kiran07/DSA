import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < prefix.length;i++){
            if(prefix[i] - k == 0) count++;
            if(map.containsKey(prefix[i] - k)) count+= map.getOrDefault(prefix[i] - k,0);
            map.put(prefix[i],map.getOrDefault(prefix[i],0) + 1);
        }
        return count;
    }
}
        // int c = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             c++;
        //         }
        //     }
        // }
        // return c;