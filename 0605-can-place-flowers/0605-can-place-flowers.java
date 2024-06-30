class Solution 
{
    public boolean canPlaceFlowers(int[] flowerbed, int nn) 
    {
        int n=flowerbed.length;
          for(int i=0;i<flowerbed.length;i++)
          {
              if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==n-1 || flowerbed[i+1]==0))
              {
              nn-=1;
              flowerbed[i]=1;
              }

          }
          return nn<=0;
        
    }
}