//Reverse an Array

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println("Reversed array: ");
        for(int i = array.length-1; i>=0 ; i--){
            System.out.print(array[i]);
            if(i>0){
                System.out.print(" ");
            }
        }
    }
    
}
