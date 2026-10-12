class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res = 0;

        for (String w : words) {
            boolean flag = true;
            for (char c : w.toCharArray()) {
                if (allowed.indexOf(c) == -1) {
                    flag = false;
                    break;
                }
            }
            if (flag) res++;
        }

        return res;
    }
    /*public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(String str : words){
            boolean flag = false;
            for(int i = 0; i < str.length(); i++){
                if(allowed.contains(String.valueOf(str.charAt(i)))){
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }

        return count;
    }*/
}