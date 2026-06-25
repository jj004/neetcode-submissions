class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if ((s.length()==0) || (s.length() == 1 && t.contains(String.valueOf(s.charAt(0))))) {
            return true;
        }
        int latestIndex = -1;
        boolean flag = false;
        int i = 0;
        while (i < s.length()) {
            for (int j = latestIndex + 1; j < t.length(); j++) {
                if (t.charAt(j) == s.charAt(i) && latestIndex < j) {
                    latestIndex = j;
                    flag = true;
                    break;
                } else{
                    flag = false;
                }
            }
            if (flag) {
                i++;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}