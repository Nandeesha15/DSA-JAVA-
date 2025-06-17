//Find the Second Largest Element in an Array

public class SecondLargest {
    public static void main(String[] args) {
       
        int array[]  = {12, 35, 1, 10, 34, 1};
         int largest = array[0];
         int SecondLargest = array[0];
        for(int i=0;i<array.length;i++){
            if (array[i]>largest) {
                largest = array[i];
                System.out.println("First Largest element = "+largest);
                
            }

        }
        for(int i = 1;i<array.length;i++)
        {
            if (array[i]>SecondLargest && array[i]!=largest) 
            {
                SecondLargest = array[i];
                System.out.println("second Largest element = "+SecondLargest);
                break;
                
            }

        }
    }
    
}
