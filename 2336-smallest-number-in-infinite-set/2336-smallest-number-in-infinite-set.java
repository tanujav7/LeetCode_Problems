class SmallestInfiniteSet {

    TreeSet<Integer> set = new TreeSet<>();
    
    public SmallestInfiniteSet() {
        
        for(int i=1; i<=1000; i++)
            set.add(i);
    }
    
    public int popSmallest() {
        return set.pollFirst();
    }
    
    public void addBack(int num) {
        set.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */