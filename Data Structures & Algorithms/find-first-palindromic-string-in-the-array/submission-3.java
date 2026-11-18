class Solution {
    // My Solution:
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(isPallindrome(word)){
                return word;
            }
        }

        return "";
    }

    private boolean isPallindrome(String word){
        int len = word.length();
        for(int i = 0, j = len - 1; i < j; i++, j--){
            if(word.charAt(i) != word.charAt(j)){
                return false;
            }
        }

        return true;
    }

    // NeetCode Solution 1:
    /*public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (w.equals(new StringBuilder(w).reverse().toString())) {
                return w;
            }
        }
        return "";
    }*/

    // NeetCode Solution 2:
    /*public String firstPalindrome(String[] words) {
        for (String w : words) {
            int l = 0, r = w.length() - 1;
            while (w.charAt(l) == w.charAt(r)) {
                if (l >= r){
                    return w;
                }
                l++;
                r--;
            }
        }
        return "";
    }*/
}
