class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int i=0, j=people.length-1;
        int res = 0;
        while(i<=j){
            res++;
            if(people[i]+people[j]<=limit)
                i++;
            j--;
        }
        return res;
    }
}