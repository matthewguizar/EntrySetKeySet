import java.util.HashMap;
import java.util.Map;

public class Main{

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //insert into map O(1) if there is no collision
        //not stored in a sorted order
        map.put(1, "Matthew");
        map.put(2, "another");
        map.put(3, "name");
        map.put(40, "the");

        //can remove items in O(1) if no collisions
        map.remove(2);

        //we can retrieve items based on keys O(1)
        //null can be keys but should be avoided
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    //    for (Integer key : map.keySet()){
    //     System.out.println(map.get(key));
    //    }
        

    }
}