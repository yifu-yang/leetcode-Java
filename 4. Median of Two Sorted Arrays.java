class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        if(i==nums1.length){
            while(j<nums2.length){
                list.add(nums2[j]);
                j++;
            }
        }else{
            while(i<nums1.length){
                list.add(nums1[i]);
                i++;
            }
        }
        int length = list.size();
        if(length%2==0){
            return ((double)(list.get(length/2)+list.get(length/2-1)))/2;
        }else{
            return (double)list.get(length/2);
        }
    }
}