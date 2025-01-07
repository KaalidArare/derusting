import java.util.*;


public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> map = new HashMap<>();

    // Put 3 different key/value pairs in the Map
    map.put("Apples", 5);
    map.put("Bananas", 10);
    map.put("Oranges", 7);

    // Get the value associated with a given key in the Map
    int applesCount = map.get("Apples");
    System.out.println("Value associated with key 'Apples': " + applesCount);

    // Find the size (number of key/value pairs) of the Map
    int mapSize = map.size();
    System.out.println("Size of the Map: " + mapSize);

    // Replace the value associated with a given key (the size of the Map should not change)
    map.put("Apples", 8);
    System.out.println("Updated value for 'Apples': " + map.get("Apples"));

    // Check whether the Map contains a given key
    boolean containsKey = map.containsKey("Bananas");
    System.out.println("Map contains key 'Bananas': " + containsKey);

    // Check whether the Map contains a given value
    boolean containsValue = map.containsValue(10);
    System.out.println("Map contains value 10: " + containsValue);

    // Iterate over the keys of the Map, printing each key
    System.out.println("Keys in the Map:");
    for (String key : map.keySet()) {
        System.out.println(key);
    }

    // Iterate over the values of the Map, printing each value
    System.out.println("Values in the Map:");
    for (int value : map.values()) {
        System.out.println(value);
    }

    // Iterate over the entries in the Map, printing each key and value
    System.out.println("Entries in the Map:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }

    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
