public class RemoveSpace {
    public static void main(String[] args) {
        String s = "car Bus Tractor";
        Remove(s);

        
    }

    static void Remove(String s ){
      String modified =   s.replaceAll(" ", "");
      System.out.println(modified);


    }
    
}
