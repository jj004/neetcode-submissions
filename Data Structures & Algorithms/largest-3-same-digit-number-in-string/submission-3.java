class Solution {
    // My Code
    /*public String largestGoodInteger(String num) {
        int max = -1;
        boolean flag = false;
        for(int i = 0; i < num.length() - 2; i++){
            if(this.checkDigits(num.substring(i, i+3))){
                int no = Integer.parseInt(num.substring(i, i+3));
                max = max < no ? no : max;
                flag = true;
            }
        }

        return flag ? max > 0 ? String.valueOf(max) : "000" : "";
    }

    private boolean checkDigits(String no){
        char n = no.charAt(0);
        boolean flag = false;
        for(int i = 1; i < no.length(); i++){
            if(n == no.charAt(i)){
                flag = true;
            } else{
                flag = false;
                break;
            }
        }

        return flag;
    }*/

    //NeetCode Solution 1:
    /*public String largestGoodInteger(String num) {
        String res = "";
        int val = 0;

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i) == num.charAt(i + 2)) {
                String tmp = num.substring(i, i + 3);
                if (val <= Integer.parseInt(tmp)) {
                    val = Integer.parseInt(tmp);
                    res = tmp;
                }
            }
        }

        return res;
    }*/

    //NeetCode Solution 2:
    public String largestGoodInteger(String num) {
        String res = "";

        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) &&
                num.charAt(i) == num.charAt(i + 2)) {
                String curr = num.substring(i, i + 3);
                if (curr.compareTo(res) > 0) {
                    res = curr;
                }
            }
        }

        return res;
    }

    //NeetCode Solution 3:
}