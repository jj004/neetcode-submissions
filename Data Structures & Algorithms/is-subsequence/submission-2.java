class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if ((s.isEmpty()) || (s.length() == 1 && t.contains(String.valueOf(s.charAt(0))))) {
            return true;
        }
        int latestIndex = -1;
        boolean flag = false;
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            while(j < t.length()){
                if (t.charAt(j) == s.charAt(i) && latestIndex < j) {
                    latestIndex = j;
                    flag = true;
                    break;
                } else{
                    flag = false;
                }
                j++;
            }
            if (flag) {
                i++;
            } else {
                break;
            }
        }
        return flag;
    }
}