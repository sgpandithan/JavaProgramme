import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurrencesInString {
    public static Map<Character,Integer>characterOccurrenceCount(String str){
        Map<Character,Integer> charcountMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            if(charcountMap.containsKey(c)){
                charcountMap.put(c,charcountMap.get(c)+1);
            }else {
                charcountMap.put(c,1);
            }
        }
     return charcountMap;
    }

    public static void main(String[] args) {
        String str = "Welcome to TamilNadu Tourism and Cultural program";
        Map<Character,Integer> charOccurCount = characterOccurrenceCount(str);
        for(Map.Entry<Character,Integer> entry : charOccurCount.entrySet()){
            System.out.println(entry.getKey()+ " :" + entry.getValue());
        }
    }
}
