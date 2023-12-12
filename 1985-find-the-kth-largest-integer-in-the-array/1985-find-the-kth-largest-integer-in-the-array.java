class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        
        PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> a.length() == b.length() ? a.compareTo(b) : a.length()-b.length());
        
        for(String s : nums){
            pq.offer(s);
            
            if(pq.size() > k)
                pq.poll();
            
        }
        
        return pq.peek();
    }
}