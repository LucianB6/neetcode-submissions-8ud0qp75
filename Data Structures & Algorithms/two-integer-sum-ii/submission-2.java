class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int leftValue;
        int rightValue;
        int[] results = new int[2];


        // int[] results = new int[2];

        // for (int i = 0; i < numbers.length; i++){
        //     for (int j = i + 1; j < numbers.length; j++){
        //         if (numbers[i] + numbers[j] == target && numbers[i] != numbers[j]){
        //             results[0] = i + 1;
        //             results[1] = j + 1;

        //             return results;
        //         }
        //     }
        // }

        for (int i = 0; i < numbers.length; i++){
            int result = target - numbers[i];
            
            leftValue = i + 1;
            rightValue = numbers.length - 1;

            while (leftValue <= rightValue){
                int midValue = leftValue + (rightValue - leftValue) / 2;
                
                if (numbers[midValue] == result){
                    results[0] = i + 1;
                    results[1] = midValue + 1;
                    return results;
                }

                else if (numbers[midValue] > result){
                    rightValue = midValue - 1;
                }
                else if (numbers[midValue] < result){
                    leftValue = midValue + 1;
                }
            }
        }

        return results;
        
    }
}
