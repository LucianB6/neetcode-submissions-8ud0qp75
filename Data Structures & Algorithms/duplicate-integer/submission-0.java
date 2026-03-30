class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> uniqueValues = new HashSet();
        int numsSize = nums.length;

        for ( int i = 0; i < nums.length; i++ ){
            uniqueValues.add(nums[i]);
        } 

        return uniqueValues.size() != numsSize;
    }
}