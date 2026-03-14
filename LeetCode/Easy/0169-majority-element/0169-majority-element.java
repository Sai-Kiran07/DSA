class Solution {
    public int majorityElement(int[] nums) {
                    //Moore's Voting Algorithm.
        int majority = nums[0];
        int vote = 0;
        for(int num:nums){
            if(num == majority){
                vote++;
            }
            else{
                vote--;
                if(vote == 0) {
                    majority = num;
                    vote = 1;
                }
            }
        }
        return majority;
                            //Sorting (Time: O(n) but additional space complexity for HashMap).
        // Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0) + 1);
        //     if(map.get(num) > nums.length/2){
        //         return num;
        //     }
        // }return -1;
    }
}
