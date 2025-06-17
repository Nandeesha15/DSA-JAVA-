//Remove Duplicates from a Sorted Array

import java.util.Arrays;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int array[] = {1, 1, 2, 2, 3, 4, 4};
        int new_array[] = new int[array.length];
        new_array[0] = array[0];
        int j =0;
        for(int i =1 ; i<array.length;i++){
            if (array[i]!=array[i-1]) {
                j++;
                new_array[j] = array[i];
                
                
            }
        }
         System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOfRange(new_array, 0, j + 1)));


        
    }
    
}
