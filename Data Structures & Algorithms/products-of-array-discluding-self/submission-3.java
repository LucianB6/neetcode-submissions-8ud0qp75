class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        int prefix = 1;

        for (int i = 0; i < nums.length; i++){
            output[i] = prefix;
            prefix = prefix * nums[i];
        }
        // exemplu 1 2 4 8
        // output curent 1 1 2 8

        int post = 1;

        for (int i = nums.length - 1; i >= 0; i--){
            output[i] *= post; 
            post *= nums[i];
        }


        return output;
    
    }
}  
