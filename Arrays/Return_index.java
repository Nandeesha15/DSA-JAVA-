//Find the Index of an Element

public class Return_index {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int element = 7;
        boolean found = false;
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                System.out.println("the index of the element " + array[i] + " is: " +i);
                found = true;
                break;

            }

        }
        if(!found){
            System.out.println("Element not found ");
        }
    }
    
}
