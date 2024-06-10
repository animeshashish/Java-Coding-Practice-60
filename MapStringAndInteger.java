package JavaCodingPractice60;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapStringAndInteger {
    public static void main(String[] args) {

        // Crete HasMap Object

        HashMap<String, Integer> nameAge = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        nameAge.put("Animesh", 28);
        nameAge.put("Ankita", 30);
        nameAge.put("David", 32);
        nameAge.put("George", 30);

        System.out.println("List of key and value");
        for (Map.Entry m : nameAge.entrySet()) {
            System.out.println(m.getKey() +  " " + m.getValue());
        }

    }
}
