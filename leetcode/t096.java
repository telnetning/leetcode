class Solution 
{
	static int[] resCache = new int[100];
	static {
		resCache[0] = 1;
	}
    public int numTrees(int n) 
    {
    	if(resCache[n] != 0) return resCache[n];

		for(int i = 0; i < n; i++)
		{
			resCache[n] += numTrees(i) * numTrees(n - 1 - i);	
		}
        
        return resCache[n];
    }
}

public class t096
{
	public static void main(String[] args)
	{
		Solution s = new Solution();
		System.out.println(s.numTrees(3));	
	}
}
