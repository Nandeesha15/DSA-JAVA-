//Find the Largest Element in an Array

public class LargestElem {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int largest = arr [0];
        for(int i = 0;i<arr.length;i++)
        {
            if(largest<arr[i])
            {
                largest = arr[i];
            }

        }
        System.out.println("The largest element in an array is: "+largest);


    }
    
}
