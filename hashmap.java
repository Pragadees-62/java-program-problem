import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("Praga",456);
        map.put("Sotta",789);
        map.put("Akash",345);
        map.put("Mathav",5678);
        System.out.println(map);
        // for(Map.Entry m:map.entrySet()){
        //     System.out.println(m.getKey()+" "+m.getValue()  );
        // }
        List<Integer>list =new ArrayList<>(map.values());
        List<String>list1 =new ArrayList<>(map.keySet());
        for(int i=0;i<list;i++){

        }
    }
}