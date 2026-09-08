class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0; i<nums.length;i++){
            result.add(nums[i]);
        }
                
        for(int i=0; i<=nums.length; i++){
            if(!result.contains(i)){
                return i;
            }
        }
        return -1;
    }
}

