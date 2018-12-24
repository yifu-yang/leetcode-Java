class Solution {
    public int maxSubArray(int[] nums) {        
        int max = 0;
        int tmp = 0;
        for(int i = 0;i<nums.length;i++){
            if(i==0){
                tmp = nums[i];
                max = tmp;
                continue;
            }
           if(tmp+nums[i]<nums[i]){
               tmp = nums[i];
           }
            else{
               tmp = tmp+nums[i];
            }
            if(max < tmp){
                max = tmp;
            }
        }
        return max;
    }
}