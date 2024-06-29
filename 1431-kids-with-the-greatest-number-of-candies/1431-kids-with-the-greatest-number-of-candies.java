class Solution 
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> a=new ArrayList<>();
        int maxi=0;
        for(int i=0;i<candies.length;i++)
        maxi=Math.max(candies[i],maxi);
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)<maxi)
            a.add(false);
            else 
            a.add(true);
        }
        return a;
        
    }
}