
class ReverseString {
    public static void main(String[] args) {
        String s = "nandish";
        String reversed = Reverse(s);
        System.out.println(reversed);
       

    }

    static String Reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();


    }

}
