import java.util.Map;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        Map<Character , Integer> map = new HashMap<>();

        String str = "a green apple";

        for (char ch :str.toCharArray()){
            // if(map.containsKey(ch)){
            //     map.put(ch, map.get(ch) +1 );
            // }else{
            //     map.put(ch, 1);
            // }
        // Another way 
        if(ch == ' ') continue;
        int count = map.getOrDefault(ch, 0);
        map.put(ch, count+1); 
        }
        System.out.println(map);
// First non repeating char
        // for (char ch :str.toCharArray()){
        // if(map.get(ch) == 1){
        //     System.out.println(ch);
        //     break;
        // }

        // First repeating charater
         for (char ch :str.toCharArray()){
        if(map.get(ch) > 1){
            System.out.println(ch);
            break;
        }
        }





















        // // Keys can also be string
        // map.put(1, "Aditya");
        // map.put(2, "Bhola");
        // map.put(3, "Charan");
        // map.put(4, "Dholu");
        
        // // System.out.println(map.get(3));
        // // System.out.println(map.remove(2));
        // map.containsKey(3);
        // map.put(3, "xyz");  // overwrite a value
        // map.put(null, null); //Null can be valid value and key
        // System.out.println(map);

    }
}
