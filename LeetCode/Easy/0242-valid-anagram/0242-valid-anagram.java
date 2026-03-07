import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> smap = new HashMap<>();
        
        // Count frequencies in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            smap.put(c, smap.getOrDefault(c, 0) + 1);
        }
        
        // Subtract frequencies using string t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!smap.containsKey(c)) return false;
            
            smap.put(c, smap.get(c) - 1);
            if (smap.get(c) == 0) {
                smap.remove(c);
            }
        }
        
        return smap.isEmpty();
    }
}
