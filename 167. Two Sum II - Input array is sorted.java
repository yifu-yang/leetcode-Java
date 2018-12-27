class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int j=0;j<numbers.length;j++){
            if(map.containsKey(target-numbers[j])){
                int index = map.get(target-numbers[j]);
                if(j<index){
                    return new int[]{j+1,index+1};
                }
                else{
                    return new int[]{index+1,j+1};
                }
                
            }
        }
        return new int[2];
    }
}