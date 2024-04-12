class Solution {
    public int trap(int[] height) {
             if(height.length==0)
            return 0;
        
        int l=0;
        int r=height.length-1;
        
        int leftMax = height[l];
        int rightMax = height[r];
        
        int water=0;
        while(l<r){

        if(leftMax<rightMax){
            l++;
            leftMax = Math.max(leftMax,height[l]);
            water+=leftMax-height[l];
        }
        else{
            r--;
            rightMax = Math.max(rightMax,height[r]);
            water+=rightMax-height[r];
        }
        
        }
        
        return water;
    }
}