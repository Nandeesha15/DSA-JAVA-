public class CountVowels {
    public static void main(String[] args) {
        String s = "nandish"; // vowels - 2 consonents - 5
        
        count(s);
        
    }

    static void count(String s ){
        int vowelCount = 0;
        int consonentCount = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' || ch == 'u' ){
                vowelCount++;

            
            }
            else{
                consonentCount++;
            }

        }
        System.out.println("vowels: "+vowelCount);
        System.out.println("consonents: "+consonentCount);

    }
    
}
