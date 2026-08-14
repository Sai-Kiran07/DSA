import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i, 0) + 1);
            if(map.get(i) > (nums.length / 3)) {
                if((result.isEmpty() || result.contains(i) == false)){
                    result.add(i);  
                } 
            }
        }
        return result;
    }
}