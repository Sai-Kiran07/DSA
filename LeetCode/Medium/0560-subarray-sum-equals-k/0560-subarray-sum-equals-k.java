import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        // int prefix[] = new int[nums.length];
        // prefix[0] = nums[0];
        // for(int i = 1;i < nums.length;i++){
        //     prefix[i] = prefix[i - 1] + nums[i];
        // }
        // int count = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < prefix.length;i++){
        //     if(prefix[i] - k == 0) count++;
        //     if(map.containsKey(prefix[i] - k)) count+= map.getOrDefault(prefix[i] - k,0);
        //     map.put(prefix[i],map.getOrDefault(prefix[i],0) + 1);
        // }
        HashMap<Integer, Integer> prefix = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k) count++;

            int diff = sum - k;
            if(prefix.containsKey(diff)){
                count += prefix.get(diff);
            }
            prefix.merge(sum,1,Integer::sum);
        }
        return count;
    }
}
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }
        // return count;