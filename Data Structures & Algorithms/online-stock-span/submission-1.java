class StockSpanner {
    List<Integer> lst;
    public StockSpanner() {
        lst = new ArrayList<>();
    }
    
    public int next(int price) {
        lst.add(price);
        int i = lst.size() - 2;
        while(i >= 0 && lst.get(i) <= price){
            i--;
        }

        return lst.size() - i - 1;
    }

    /*Stack<Integer[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }
        stack.push(new Integer[] {price, span});
        return span;
    }*/
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */