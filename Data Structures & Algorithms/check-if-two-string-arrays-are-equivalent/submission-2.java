class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // One liner solutions
        //return String.join("", word1).equals(String.join("", word2));

        //Two Pointer Solution
        int w1 = 0;
        int w2 = 0;
        int i = 0;
        int j = 0;

        while(w1 < word1.length && w2 < word2.length){
            if(word1[w1].charAt(i) != word2[w2].charAt(j)){
                return false;
            }

            i++;
            j++;

            if(i == word1[w1].length()){
                w1++;
                i = 0;
            }

            if(j == word2[w2].length()){
                w2++;
                j = 0;
            }
        }

        return w1 == word1.length && w2 == word2.length;
    }
}
