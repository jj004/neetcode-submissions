class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
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
    }
}