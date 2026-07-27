class StockSpanner {
    
    Stack<Pair<Integer,Integer>> stack;
    public StockSpanner() {
        stack = new Stack<Pair<Integer,Integer>>();
    }
    
    public int next(int price) {
        int spanCount = 1;
        
        while(!stack.isEmpty() && price >= stack.peek().getKey()){
            spanCount+=stack.peek().getValue();
            stack.pop();  
        }
        stack.push(new Pair<>(price, spanCount));
        return spanCount;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */