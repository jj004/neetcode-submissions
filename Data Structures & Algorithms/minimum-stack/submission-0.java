class MinStack {

    List<Integer> stack;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.removeLast();
    }
    
    public int top() {
        return stack.getLast();
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(Integer i : stack){
            min = min < i ? min : i;
        }
        return min;
    }
}
