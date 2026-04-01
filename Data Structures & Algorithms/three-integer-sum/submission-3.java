class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<Integer> sortedList = new ArrayList<>();

        for (int n : nums){
            sortedList.add(Integer.valueOf(n));
        }

        Collections.sort(sortedList);
        int currentValue = 0;
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < sortedList.size(); i++){
            if (i > 0 && sortedList.get(i) == currentValue){
                continue;
            }
            int left = i + 1;
            int right = sortedList.size() - 1;

            int target = -sortedList.get(i);

            while (left < right){
                if (sortedList.get(left) + sortedList.get(right) == target){
                    List<Integer> results = new ArrayList<>();
                    results.add(sortedList.get(i));
                    results.add(sortedList.get(left));
                    results.add(sortedList.get(right));
                    if(!output.contains(results)){
                        output.add(results);
                    }
                    right --;
                }
                else if (sortedList.get(left) + sortedList.get(right) > target){
                    right --;
                }
                else if (sortedList.get(left) + sortedList.get(right) < target){
                    left++;
                }
            }
            currentValue = sortedList.get(i);
        }
        return output;
    }
}
