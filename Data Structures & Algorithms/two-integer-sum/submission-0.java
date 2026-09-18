class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            Integer difference= target - nums[i];
            if(hm.containsKey(difference)){
                int[] result = {hm.get(difference), i};
                return result;
            }


            hm.put(nums[i], i);
        }
        int[] result = new int[5];
        return result;
    }
}
