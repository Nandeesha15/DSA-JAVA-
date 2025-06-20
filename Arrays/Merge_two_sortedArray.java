//Merge Two Sorted Arrays.


import java.util.Arrays;


public class Merge_two_sortedArray {
    public static void main(String[] args) {
        
        int num1[] = {1, 3, 5, 0, 0, 0}; 
        int num2[] = {2, 4, 6};          

        int m = 3; 
        int n = 3; 

        
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

        
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }

        System.out.println("Merged Array: " + Arrays.toString(num1));
    }
}