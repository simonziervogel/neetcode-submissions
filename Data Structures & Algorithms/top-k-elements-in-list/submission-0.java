class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap();

        int[] result = new int[k];
        
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            if(frequencies.containsKey(curr)){
                int value= frequencies.get(curr);
                frequencies.put(curr, value+1);
            }
            else{
                frequencies.put(curr, 1);
            }
        }

        for(int i=k; i>0; i--){

            int currHigh = 0;
            int currIndex =0;

            for(Integer j : frequencies.keySet()){
                int curr = frequencies.get(j);
                if(curr>currHigh){
                    currHigh= curr;
                    currIndex =j;
                }
            }

            frequencies.remove(currIndex);
            result[k-i] = currIndex;
        }
        
        
        return result;
        }
}
