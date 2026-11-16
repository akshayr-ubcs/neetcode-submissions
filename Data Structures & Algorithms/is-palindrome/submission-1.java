class Solution {
    public boolean isPalindrome(String s) {
        s= s.replaceAll("[^a-zA-Z0-9]", "");
        char[] c = s.toLowerCase().toCharArray();


        for(int i=0, j= c.length-1; i<=j; ++i,--j)
        {
            if(c[i]!=c[j])
            return false;
        }

        return true;



        
    }
}
