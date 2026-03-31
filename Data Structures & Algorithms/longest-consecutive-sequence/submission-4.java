class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> uniqueValues = new HashSet<>();

        for (int num : nums) {
            uniqueValues.add(num);
        }

        // we have an unique values list in order to check if a value have neighboars
        int consecutiveValues = 0;
        int maxConsecutive = 0;
        if (nums.length == 1){
            return 1;
        }
        for (int i = 0; i < nums.length; i++){
            if (!uniqueValues.contains(nums[i] - 1)){
                //this is the beginning of a sequence;
                int currentValue = nums[i];
                consecutiveValues += 1;
                while ( uniqueValues.contains(currentValue + 1) ){
                        currentValue = currentValue + 1;
                        consecutiveValues += 1;
                }
                if (consecutiveValues > maxConsecutive){
                    maxConsecutive = consecutiveValues;
                }
                consecutiveValues = 0;
            }
            else { 
                consecutiveValues = 0;
            }

        }

        return maxConsecutive;

    }
}
