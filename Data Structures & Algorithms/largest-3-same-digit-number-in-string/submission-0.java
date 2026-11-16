class Solution {
    public String largestGoodInteger(String num) {
        int max = 0;
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
    }
}