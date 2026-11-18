class Solution {
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
}
