class Solution {
    public int compareVersion(String version1, String version2) {
        
        String arr1[] = version1.split("\\.");
        String arr2[] = version2.split("\\.");
        
        int n1 = arr1.length;
        int n2 = arr2.length;
        
        int i=0;
        
        while(i<n1 || i<n2){
            
            if(i<n1 && i<n2){
                
                if( Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i]) )
                    return -1;
                else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i]))
                    return 1;
            }
            
            else if(i<n1){
                 if(Integer.parseInt(arr1[i])>0)
                    return 1;
            }
            
            else if(i<n2){
                 if(Integer.parseInt(arr2[i])>0)
                    return -1;
            }
            
            i++;
        }
        
        return 0;
    }
}