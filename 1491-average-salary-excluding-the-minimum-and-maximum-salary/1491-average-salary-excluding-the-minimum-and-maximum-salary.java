class Solution {
    public double average(int[] salary) {
        
        double sum = 0;
        int n = salary.length;
       double max = salary[0];
      double min = salary[0];
        
        for(int i=0; i<n; i++){
            sum+=salary[i];
            
            if(salary[i]>max)
                max = salary[i];
            
            if(salary[i]<min)
                min = salary[i];
        }
        
        int k = n - 2;
        
        return (sum-max-min)/k;
        
        
    }
}