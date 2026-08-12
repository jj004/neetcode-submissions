class Solution {
    public boolean validPalindrome(String s) {
        if(this.isPalindrome(s)){
            return true;
        }
        int skipCount = 0;
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return this.isPalindrome(s.substring(0, i) + s.substring(i + 1))
                || this.isPalindrome(s.substring(0, j) + s.substring(j + 1));
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}