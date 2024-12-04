class RandomizedSet {

    List<Integer> list;
    Random random;
    
    public RandomizedSet() {
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(val))
                return false;
        }
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals(val)){
                int v = list.get(list.size()-1);
                list.set(i, v);
                list.remove(list.size()-1);
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */