//directia generala antifrauda fiscArrayL/

//Ioan Alexandru Toma Nanu

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerList = new HashMap();

        int[] output = new int[2];
        int difference = 0;

        for (int i = 0; i < nums.length; i++){
            //daca nu avem in lista deja indexul

            difference = target - nums[i];
            if (integerList.containsValue(difference)){
                for (Map.Entry<Integer, Integer> entry: integerList.entrySet()){
                    if (entry.getValue().equals(difference)){
                        output[0] = entry.getKey();
                        output[1] = i;
                        return output;
                    }
                }
            }
            else{
                integerList.put(i, nums[i]);
            }
        }

        return output;

    }
}
