package JavaCodingPractice60;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringShortList {
    public static void main(String[] args) {

        // Creating list of string using Array List
        List<String> shortListString = new ArrayList<>();
        shortListString.add("Animesh"); // Adding elements using list.add() method
        shortListString.add("Chandan");
        shortListString.add("Ramesh");
        shortListString.add("Vikash");
        shortListString.add("Piyush");

        // shortlist String using Collections.sort() method
        // Shortlist means arranging (Integer, String etc.) in proper order.
        Collections.sort(shortListString);

        System.out.println("Shorted List of string:" + shortListString);
    }
}
