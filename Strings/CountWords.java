public class CountWords {
    public static void main(String[] args) {
        String s = "This is a java program"; //5
        Count(s);
        
    }

    static void Count(String s ){
        String[] words = s.trim().split("\\s+");
        int countWords = words.length;
        System.out.println(countWords);   

    }
    
}
