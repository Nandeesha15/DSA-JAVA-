public class Maxx_elem {
    public static int maxElement(int array[]){
        int largest = array[0];
        for(int i =0;i<array.length;i++){
            if (array[i]>largest) {
                largest = array[i];
                
            }

        }
        return largest;

    }
    public static void main(String[] args) {
       int arr [] = {1,2,3,4,5};
       int max = maxElement(arr);
       System.out.println("The maximum element is :"  +max);



        
    }
    
}
