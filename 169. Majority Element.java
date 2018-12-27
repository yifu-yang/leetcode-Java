class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
            map.put(nums[i],1);
            }
        }
        int max = 0;
        int number = 0;
        for(Integer key:map.keySet()){
            if(map.get(key)>max){
                max =  map.get(key);
                number = key;
            }
        }
        return number;
    }
}