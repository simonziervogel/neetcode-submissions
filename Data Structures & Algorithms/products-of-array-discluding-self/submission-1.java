class Solution {
    public int[] productExceptSelf(int[] nums) {
        /*int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=0; j<nums.length; j++){
                product = nums[j] * product;
            }
            output[i]= product;
        }
        return output;*/
        int[] output = new int[nums.length];
        int nullindex = -1;

        int product = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                product = 0;
                nullindex = i;
                break;
            }
            else{
                product= product * nums[i];
            }
        }

        if(nullindex != -1){
           for(int i=0; i<output.length; i++){
            if(i==nullindex){
                int prod =1;
                for(int j=0; j<nums.length; j++){
                    if(j==i){
                        continue;
                    }
                    else{
                        prod = prod * nums[j];
                    }
                }
                output[i] = prod;
            }
            else{
                
                output[i] = 0;
                
            }
           } 
        }
        else{
            for(int n=0; n<nums.length; n++){
            output[n] = product/nums[n];
            }
        }

        return output;
    }
}  
