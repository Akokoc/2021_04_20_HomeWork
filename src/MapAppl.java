import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapAppl {
    public static void main(String[] args) {
        String text;
        displayWordCounts("e rt e rt e r");



    }

    public static void displayWordCounts(String text) {
        Map<String, Integer> count = new TreeMap<>();
        String[] splited = text.split(" ");
        for (int i = 0; i < splited.length; i++) {
            if(!count.containsKey(splited[i])){
                count.put(splited[i], 1);
//                System.out.println(splited[i]+" - "+count.get(splited[i]));
            }else{
                count.put(splited[i], count.get(splited[i])+1);
//                System.out.println(splited[i]+" - "+count.get(splited[i]));
            }
        }
        for(Map.Entry<String,Integer> e: count.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }

    }


}
