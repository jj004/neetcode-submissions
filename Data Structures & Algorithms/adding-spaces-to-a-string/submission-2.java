class Solution {
    // My solution 1 =>
    /*public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int j = 0;
        for(int i = 0; i < spaces.length; i++){
            while(j < spaces[i]){
                sb.append(arr[j]);
                j++;
            }

            sb.append(" ");
        }
        if(j < arr.length){
            sb.append(s.substring(j));
        }

        return sb.toString();
    }*/

    // My solution Improved:
    /*public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);
        int j = 0;
        for (int i = 0; i < spaces.length; i++) {
            while (j < spaces[i]) {
                sb.append(s.charAt(j));
                j++;
            }
            sb.append(" ");
        }
        sb.append(s, j, s.length());   // tail, no temp String
        return sb.toString();
    }*/

    // Neetcode Solution:
    public String addSpaces(String s, int[] spaces) {
        StringBuilder answer = new StringBuilder(s.length() + spaces.length);
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && spaces[j] == i) {
                answer.append(' ');
                j++;
            }
            answer.append(s.charAt(i));
        }
        return answer.toString();
    }
}
