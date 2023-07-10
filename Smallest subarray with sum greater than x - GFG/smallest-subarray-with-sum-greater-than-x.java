//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            // int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.smallestSubWithSum(a, n, m));
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int smallestSubWithSum(int a[], int n, int x) {
        // Your code goes here 
        int left = 0;
        
        //left will help in shrinking the window
        //right will go through the array
       
        int currentWindowSum = 0;
        int res = Integer.MAX_VALUE;
        
        for(int right = 0; right<a.length; right++){
            currentWindowSum +=a[right];
            
            while(currentWindowSum>x){
                currentWindowSum = currentWindowSum - a[left];
                res = Math.min(res,right-left+1);
                left++;
            }
        }
        
        return res==Integer.MAX_VALUE ? 0 : res;
    }
}

