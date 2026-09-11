class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> data = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        for(String op : tokens){
            switch(op){
                case "+":
                    num2 = data.pop();
                    num1 = data.pop();
                    data.push(num1 + num2);
                    break;
                case "-":
                    num2 = data.pop();
                    num1 = data.pop();
                    data.push(num1 - num1);
                    break;
                case "*":
                    num2 = data.pop();
                    num1 = data.pop();
                    data.push(num1 * num2);
                    break;
                case "/":
                    num2 = data.pop();
                    num1 = data.pop();
                    if(num1 == 0 || num2 == 0){
                        data.push(0);
                    }
                    data.push(num1 / num2);
                    break;
                default:
                    data.push(Integer.parseInt(op));
                    break;
            }
        }

        return data.pop();
    }
}
