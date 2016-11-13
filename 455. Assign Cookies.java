public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int length=0;
        int count = 0;
        if(g.length>s.length)
            length=s.length;
        else
            length=g.length;

        for(int i=0,j=0;i<length&&j<length;){
            if(g[i]<=s[j]){
                i+=1;
                j+=1;
                count+=1;
            }
            else {
                j+=1;
            }
        }
        return count;
    }
}