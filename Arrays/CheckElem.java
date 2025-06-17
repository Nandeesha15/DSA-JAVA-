//Check if an Array Contains a Specific Element

public class CheckElem {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        int element = 7;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println("element found at index " + i);
                found = true;
                break;

            }

        }
        if (!found) {
            System.out.println("element not found at any index");

        }

    }

}
