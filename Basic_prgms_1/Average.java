public class Average {
    public static int averageOfNum(int array[]) {
        int length = array.length;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg = avg + array[i];


        }
        return avg/length;

    }

    public static void main(String[] args) {
        int arr[] = {10,20,30};

        int ans = averageOfNum(arr);
        System.out.println("The average of array elements is : "+ans);

    

    }

}
