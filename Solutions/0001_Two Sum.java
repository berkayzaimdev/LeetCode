class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int[] result = new int[2];
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(i!=j&&nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                    flag=true;
                    break;
                }
            }
            if(flag)
            break;
        }
        return result;
    }
}
