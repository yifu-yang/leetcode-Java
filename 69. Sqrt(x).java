class Solution {
    public int mySqrt(int x) {
        int half = x/2;
        if(x == 1||x==0){
            return x;
        }
        for(long i=1;i<=half;i++){
            if(i*i==x){
                return (int)i;
            }
            if((i*i<x)&&((i+1)*(i+1)>x)){
                return (int)i;
            }
        }
        return x;
    }
}