class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int r = k%length;
        int tmp = 0;
        if(r==0){
            return ;
        }
        for(int i=r;i>0;i--){
            tmp = nums[length-1];
            for(int j=length-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0] = tmp;
        }
        return ;
    }
}