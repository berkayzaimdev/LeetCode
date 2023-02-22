class Solution 
{
    public boolean isPalindrome(int x) 
    {
        char[] xt = Integer.toString(x).toCharArray();
        for(int i=0;i<xt.length/2;i++)
        {
            if(xt[i]!=xt[xt.length-1-i]) return false;
        }
        return true;
    }
}
