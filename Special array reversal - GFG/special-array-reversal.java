//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String reverse(String str)
    {
        //complete the function here
        int j=str.length()-1;
        
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                while(!Character.isLetter(str.charAt(j)))
                      j--;
                res.append(str.charAt(j--));
            }
            else{
                res.append(str.charAt(i));
            }
        }
        
        return res.toString();
    }
}