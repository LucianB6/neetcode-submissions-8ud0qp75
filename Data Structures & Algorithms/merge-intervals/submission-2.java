class Solution {
    public int[][] merge(int[][] intervals) {
        int index = 0;
        int mergedIntervals = 0;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> output = new ArrayList<>();
        while (index < intervals.length){
            if(output.isEmpty()){
                output.add(intervals[index]);
                index++;
                continue;
            }
            else {
                int[] prevInterval = output.get(output.size() - 1);
                int[] currInterval = intervals[index];

                int prev_min = prevInterval[0];
                int prev_max = prevInterval[1];

                int curr_min = currInterval[0];
                int curr_max = currInterval[1];

                if (prev_max >= curr_min){
                    prevInterval = new int[]{prev_min, Math.max(prev_max, curr_max)};
                    output.removeLast();
                    output.add(prevInterval);
                }
                else{
                output.add(currInterval);
                }

            }
            index++;
        }
        int[][] result = output.toArray(new int[output.size()][]);
        return result;

    }
}
