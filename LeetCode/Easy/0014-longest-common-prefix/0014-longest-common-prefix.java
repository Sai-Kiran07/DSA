class Solution {
    public String longestCommonPrefix(String[] strs) {
            if(strs[0].length() == 0) return "";
            int index = 0;
            char ch;
            for(int i = 0; i < strs[0].length(); i++){
                ch = strs[0].charAt(index);

                for(int j = 0; j < strs.length; j++){
                    if(strs[j].length() == index) return strs[0].substring(0,index);
                    if(strs[j].charAt(index) != ch)
                    {
                        return strs[0].substring(0,index);
                    }
                }
                index++;
                if(index == strs[0].length()){
                    return strs[0].substring(0,index);
                }
            }
            return strs[0];
        }
    }