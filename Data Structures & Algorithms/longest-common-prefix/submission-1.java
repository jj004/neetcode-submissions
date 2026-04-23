class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){ return "";}
        if(strs.length == 1) { return strs[0];}
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        StringBuilder longestPrefix = new StringBuilder();
        String first = strs[0];
        boolean flag = false;
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch == strs[j].charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                longestPrefix.append(ch);
            } else {
                break;
            }
        }
        return longestPrefix.toString();
    }
}