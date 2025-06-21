public class Reverse_array {
    public static void main(String[] args) {
        int array [] = {1,2,3,4};
        System.out.print("Array after reversing = ");
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
    
}
