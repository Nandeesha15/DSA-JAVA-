//Calculate the Sum of All Elements

public class SumOfElem {
    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int sumofarray = 0;
        for(int i =0 ; i<array.length;i++)
        {
            sumofarray = sumofarray + array[i];

        }
        System.out.println("The sum of array elements is: "+sumofarray);
    }
    
}
