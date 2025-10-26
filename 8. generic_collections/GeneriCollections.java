import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;

public class GeneriCollections {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<>();
        Map<Integer, String> map = new HashMap<>();

        // List
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice");
        System.out.println(names);

        // Set
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice");
        System.out.println(uniqueNames);

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());

        // Map
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice",85);
        scores.put("Bob",90);
        scores.put("Tino",100);
        scores.put("John",80);
        System.out.println(scores);

        for(Map.Entry<String, Integer> e: scores.entrySet()){
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        // Key Utility Methods in Collections
        List<Integer> numbers = Arrays.asList(3,1,4,1,5);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        // finding maximum and minimum elements
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // shuffling the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
    }
}