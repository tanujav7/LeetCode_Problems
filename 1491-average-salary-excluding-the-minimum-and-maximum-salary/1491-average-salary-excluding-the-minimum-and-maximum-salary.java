class Solution {
    public double average(int[] salary) {
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<salary.length; i++){
            if(salary[i]<min)
                min = salary[i];
            
            if(salary[i]>max)
                max = salary[i];
        }
        
        int count = -2;
        double sum = 0;
        
        for(int i=0; i<salary.length; i++){
              sum+=salary[i];
              count++;
        }
        
        sum = sum-max-min;
        
        return sum/count;
    }
}