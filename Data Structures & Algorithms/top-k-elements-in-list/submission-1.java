class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> tierList = new TreeMap<>(Collections.reverseOrder());

        for (int num: nums){
        
            if ( tierList.containsKey(num) ){
                tierList.put(num, tierList.get(num) + 1);
            }
            else {
                tierList.put(num, 1);
            }
        }
        /*
        Now our map looks like that:
        {
        1 : 1
        2 : 3
        3 : 3
        }
        */

        Map<Integer, List<Integer>> freqMap = new TreeMap<>(Collections.reverseOrder());
        for ( Map.Entry<Integer, Integer> map : tierList.entrySet()){
                int number = map.getKey();
                int freq = map.getValue();

                freqMap.computeIfAbsent(freq, m -> new ArrayList()).add(number);
        }

                /*
        Now our map looks like that:
        {
        3 : [3, 2]
        1 :[1]
        }
        */   

        int [] output = new int[k];
        int index = 0;

        for ( Map.Entry<Integer, List<Integer>> topFreqMap : freqMap.entrySet() ){
            
            List<Integer> localList = topFreqMap.getValue();
            for (int i = 0; i < localList.size(); i++){
                if ( index < k ){ 
                output[index++] = localList.get(i);
                }
                else {
                    return output;
                }
            }
        }

        return output;

    }
}
