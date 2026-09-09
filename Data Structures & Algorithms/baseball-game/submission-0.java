class Solution {
    public int calPoints(String[] operations) {
        int index = 0;
        int pointer = -1;
        String[] data = new String[operations.length];

        for(int i = 0; i < operations.length; i++){
            if(this.isInteger(operations[i])){
                data[index] = operations[i];
                pointer++;
                index++;
            } else{
                String op = operations[i];
                switch(op){
                    case "+":
                        data[index] = (data[pointer] + data[pointer - 1]);
                        index++;
                        pointer = index - 1;
                        break;
                    case "C":
                        data[pointer] = "";
                        break;
                    case "D":
                        data[index] = String.valueOf(Integer.parseInt(data[pointer])*2);
                        index++;
                        pointer = index - 1;
                        break;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < data.length; i++){
            if(this.isInteger(data[i])){
                sum += Integer.parseInt(data[i]);
            }
        }

        return sum;
    }

    private boolean isInteger(String num){
        try{
            Integer.parseInt(num);
        } catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}