class Solution 
{
    public String reverseVowels(String s) 
    {
        String r="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                r=r+String.valueOf(s.charAt(i));
           else if(s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
                r=r+String.valueOf(s.charAt(i));
        }
        StringBuilder sp1=new StringBuilder(r);
        sp1.reverse();
        String sp=new String(sp1);
        StringBuilder sb=new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'||s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
            {
              sb.append(sp.charAt(j));
                j=j+1;
            }
            else 
                sb.append(s.charAt(i));
               
            
        }
               return new String(sb);
        
        
        
    }
}