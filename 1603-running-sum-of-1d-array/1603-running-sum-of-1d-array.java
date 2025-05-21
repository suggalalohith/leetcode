class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] output = new int[nums.length];
        
        if(nums.length == 0)
            return output;
        
        output[0] = nums[0];
        
        for(int idx = 1; idx < nums.length; idx++) {
            
            output[idx] = output[idx-1]+ nums[idx];
        }
        return output;  
    }
}