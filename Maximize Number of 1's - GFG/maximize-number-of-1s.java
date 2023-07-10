//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            int m = Integer.parseInt(br.readLine().trim());

            int ans = new Solve().findZeroes(arr, n, m);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    // m is maximum of number zeroes allowed to flip
    int findZeroes(int arr[], int n, int m) {
        // code here
        int left = 0;
        int zeroCount = 0;
        int longestLength = 0;
        
        for(int right = 0; right<arr.length; right++){
            zeroCount +=(arr[right]==0) ? 1 : 0;
            
            if(zeroCount>m){
                zeroCount -=(arr[left]==0) ? 1 : 0;
                left++;
            }
            
            longestLength = Math.max(longestLength, right-left+1);
        }
        
        return longestLength;
    }
}