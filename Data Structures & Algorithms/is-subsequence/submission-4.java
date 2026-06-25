class Solution {
    public boolean isSubsequence(String s, String t) {
        return rec(s, t, 0, 0);
    }

    private boolean rec(String s, String t, int i, int j) {
        if (i == s.length()) return true;
        if (j == t.length()) return false;
        if (s.charAt(i) == t.charAt(j)) {
            return rec(s, t, i + 1, j + 1);
        }
        return rec(s, t, i, j + 1);
    }
    /*public boolean isSubsequence(String s, String t) {
        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        return j == s.length();
    }*/

    /*public boolean isSubsequence(String s, String t) {
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
            while (j < t.length()) {
                if (t.charAt(j) == s.charAt(i) && latestIndex < j) {
                    latestIndex = j;
                    flag = true;
                    break;
                } else {
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
    }*/
}