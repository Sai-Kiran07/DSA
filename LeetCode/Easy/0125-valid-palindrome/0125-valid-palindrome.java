class Solution {
    public boolean isPalindrome(String str) {
        if(str == null) return true;
        String s = str.replaceAll("\\W", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            if(s.charAt(start) == '_') start++;
            if(s.charAt(end) == '_') end--;
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }else return false;
        }
        return true;
    }
}