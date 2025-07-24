class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0 || n==1){
            return;
        }

        int nonzero = 0;
        int zero = 0;
        while(nonzero<n){
            if(nums[nonzero]!=0){
                int temp = nums[nonzero];
                nums[nonzero] = nums[zero];
                nums[zero] = temp;
                nonzero ++;
                zero++;
            }else{
                nonzero++;
            }

            
        }

    
        
    }
}