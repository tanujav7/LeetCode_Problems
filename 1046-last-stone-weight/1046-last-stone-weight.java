class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        
        for(int num : stones)
            pq.offer(num);
        
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            
            if(a>b)
                pq.offer(a-b);
        }
            
        return pq.size()==1 ? pq.peek() : 0;
    }
}