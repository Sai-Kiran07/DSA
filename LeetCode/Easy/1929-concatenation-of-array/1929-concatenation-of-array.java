class Solution {
    public int[] getConcatenation(int[] nums) {
        int pointer = 0;
        int[] ans = new int[2 * nums.length];
        for(int i = 0;i < nums.length;i++){
            ans[i] = nums[pointer++];
        }
        pointer = 0;
        for(int i = nums.length;i < ans.length;i++){
            ans[i] = nums[pointer++];
        }
        return ans;
    }
}