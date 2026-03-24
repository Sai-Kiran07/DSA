class Solution {
    public int largestAltitude(int[] gain) {
        int points[] = new int[gain.length + 1];
        points[0] = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            points[i + 1] = gain[i] + points[i];
            max = Math.max(points[i + 1],max);
        }
        return max;
    }
}