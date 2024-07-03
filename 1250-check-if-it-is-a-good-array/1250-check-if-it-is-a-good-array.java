class Solution 
{
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public boolean isGoodArray(int[] nums) 
    {
        if(nums.length==1)
        {
            if(nums[0]==1) return true;
            else 
            return false;
        } 
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum=gcd(sum,nums[i]);
            if(sum==1)
            return true;
        }
        return false;
        
    }
}