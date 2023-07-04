/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l=1, r=n;
        
        while(l<r){
            int version = l+(r-l)/2;
            
            boolean api = isBadVersion(version);
            
            if(api==false)
                l = version+1;
            else
                r = version;
        }
        
        return r;
    }
}