class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> data = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        for(String op : tokens){
            switch(op){
                case "+":
                    num1 = data.pop();
                    num2 = data.pop();
                    data.push(num1 + num2);
                    break;
                case "-":
                    num1 = data.pop();
                    num2 = data.pop();
                    data.push((num1 > num2) ? (num1 - num2) : (num2 - num1));
                    break;
                case "*":
                    num1 = data.pop();
                    num2 = data.pop();
                    data.push(num1 * num2);
                    break;
                case "/":
                    num1 = data.pop();
                    num2 = data.pop();
                    data.push((num1 > num2) ? (num1 / num2) : (num2 / num1));
                    break;
                default:
                    data.push(Integer.parseInt(op));
                    break;
            }
        }

        return data.pop();
    }
}
