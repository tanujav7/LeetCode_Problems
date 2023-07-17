/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int left = 1; 
        int right = n;
        
        while(left<=right){
            int version = left+(right-left)/2;
            boolean api = isBadVersion(version);
            if(api==false)
                left = version+1;
            else
                right = version-1;
        }
        
        return left;
    }
}