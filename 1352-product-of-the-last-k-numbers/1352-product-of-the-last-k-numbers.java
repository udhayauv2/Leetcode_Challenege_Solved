class ProductOfNumbers {
    static List<Integer> ls;

    public ProductOfNumbers() {
        ls = new ArrayList<>();
    }
    
    public void add(int num) {
        ls.add(num);
    }
    
    public int getProduct(int k) {
        int prod = 1;
        int size = ls.size();
        for(int i=size-1;i>=size-k;i--) prod *= ls.get(i);
        return prod;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */