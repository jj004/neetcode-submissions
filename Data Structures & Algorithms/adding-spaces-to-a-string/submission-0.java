class Solution {
    public String addSpaces(String s, int[] spaces) {
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
    }
}
