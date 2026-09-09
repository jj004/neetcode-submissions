class Solution {
    public int calPoints(String[] operations) {
        int index = 0;
        int pointer = -1;
        String[] data = new String[operations.length];

        for (String operation : operations) {
            if (this.isInteger(operation)) {
                data[index] = operation;
                pointer++;
                index++;
            } else {
                switch (operation) {
                    case "+":
                        data[index] = String.valueOf((Integer.parseInt(data[pointer]) + Integer.parseInt(data[pointer - 1])));
                        index++;
                        pointer = index - 1;
                        break;
                    case "C":
                        data[pointer] = "";
                        pointer--;
                        index--;
                        break;
                    case "D":
                        data[index] = String.valueOf(Integer.parseInt(data[pointer]) * 2);
                        index++;
                        pointer = index - 1;
                        break;
                }
            }
        }

        int sum = 0;
        for (String datum : data) {
            if (this.isInteger(datum)) {
                sum += Integer.parseInt(datum);
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