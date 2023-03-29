class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        left[0] = height[0];
        for(int i=1; i<n; i++)
            left[i] = Math.max(height[i],left[i-1]);
        
        right[n-1] = height[n-1];
        for(int i=n-2; i>=0; --i)
            right[i] = Math.max(height[i],right[i+1]);
        
        int water=0;
        
        for(int i=0; i<n; i++)
            water+=Math.min(left[i],right[i])-height[i];
        
        return water;
    }
}