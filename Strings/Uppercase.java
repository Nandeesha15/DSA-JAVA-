public class Uppercase {
    public static void main(String[] args) {
        String s = "nandish";
        convert(s);
        

    }

    static void convert(String s) {
       String uppercase =  s.toUpperCase();
       System.out.println(uppercase);

       String lowercase =  s.toLowerCase();
       System.out.println(lowercase);

    }

}
