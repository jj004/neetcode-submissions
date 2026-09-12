class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        AtomicInteger min = new AtomicInteger(stack.isEmpty() ? 0 : stack.get(0));
        /*return stack.stream().min(Integer::compare)
                      .orElseThrow(() -> new IllegalArgumentException("Stack is empty"));*/

        stack.stream().filter(e -> {
             min.set(min.get() < e ? min.get() : e);
             return true;
        }).count();

        return min.get();
    }

    /*List<Integer> stack;

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
    }*/
}
