//Given an array of integers, return the indices of two numbers that add up to a specific target.

public class Two_sum {
    public static int[] twoSum(int[] nums, int target) {
   
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
       
        throw new IllegalArgumentException("No two sum solution found");
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        
        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}

    

