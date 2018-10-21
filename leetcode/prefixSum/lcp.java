class Solution {
    public String longestCommonPrefix(String[] strs) {
            String result = "";
            if (strs == null || strs.length == 0) {
                return result;
            }
            String prefix = strs[0];
            for (int i = 0; i < prefix.length(); i++) {
                char c = prefix.charAt(i);
                int j = 1;
                for (; j < strs.length; j++) {
                    if (strs[j].length() - 1 < i || strs[j].charAt(i) != c) {
                        return prefix.substring(0, i);
                    }
                }
                
            }
        return  prefix;
        
    }
}
