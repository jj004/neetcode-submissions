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
                    data.push(num1 - num2);
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
                        break;
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
    /*public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String c : tokens) {
            switch (c) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                }
                default -> stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }*/
}
