class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        
        Arrays.sort(people);
        
        int count = 0;
        
        while(i<=j){
            count++;
            
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }
            
            else if(people[i]+people[j]>limit)
                j--;
        }
            
    
        return count;
    }
}