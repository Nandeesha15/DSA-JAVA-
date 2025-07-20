import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String s = "nandish";
        frequency(s);

    }

    static void frequency(String s){

        HashMap<Character,Integer> freq = new HashMap<>();
        String convert = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(freq.containsKey(ch)){
                freq.put(ch,freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
        }
        System.out.println(freq);

        


    }

}
