class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0;
        int j = people.length-1;
        
        int count = 0;
        
        Arrays.sort(people);
        
        while(i<=j){
            count++;
            if(people[i] + people[j] <= limit)
                i++;
            j--;
        }
        
        return count;
    }
}