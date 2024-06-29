class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        String s="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length())
        {
            s=s+word1.charAt(i);
            s=s+word2.charAt(i);
            i=i+1;
            j=j+1;
        }
        while(i<word1.length())
        {
            s=s+word1.charAt(i);
            i=i+1;
        }
        while(j<word2.length())
        {
            s=s+word2.charAt(j);
            j=j+1;
        }
       
        return s;
    }
}