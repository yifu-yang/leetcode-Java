class Solution {
    public int titleToNumber(String s) {
        int base = 26;
        if(null==s||s.equals(null)){
            return 0;
        }
        int l = s.length();
        int count = 0;
        for(int i=0;i<l;i++){
            count = count*base+s.charAt(i)-'A'+1;
        }
        return count;
    }
}