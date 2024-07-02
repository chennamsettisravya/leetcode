class Solution {
    public String reverseWords(String s) 
    {
        String sr[]=s.trim().split("\\s+");
        String o="";
        for(int i=sr.length-1;i>=0;i--)
        {
            if(i!=0)
             o=o+sr[i]+" ";
            else
            o=o+sr[i];
        }
       

        for(int i=0;i<sr.length;i++)
        System.out.println(sr[i]+" "+sr[i].length());
        return o;
    }
}