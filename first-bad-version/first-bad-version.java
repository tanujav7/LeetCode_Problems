/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

  public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int low = 1;
        int high = n;
        
        while(low<high){

            int mid = low+(high-low)/2;
            
            boolean api = isBadVersion(mid);
            
            if(api==false)
                low = mid+1;
            
            else
                high = mid;
            
        }
        
        return high;
    }
}