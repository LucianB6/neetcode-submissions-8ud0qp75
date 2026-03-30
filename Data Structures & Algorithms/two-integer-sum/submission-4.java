class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hashList = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (hashList.containsKey(target - nums[i])){
                int[] output = {hashList.get(target - nums[i]), i};
                return output;
            }
            hashList.put(nums[i], i);
        }
        return null;
    }
}
