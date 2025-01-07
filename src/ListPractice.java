import java.util.*;

public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> arr = new ArrayList<>();
    // Add 3 elements to the list (OK to do one-by-one)
    arr.add("john");
    arr.add("kaalid");
    arr.add("tyler");
    // Print the element at index 1
    System.out.println(arr.get(0));
    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    arr.set(0,"david");
    System.out.println(arr.get(0));
    // Insert a new element at index 0 (the length of the list will change)
    arr.add(0, "liban");
    System.out.println(arr.get(0));
    // Check whether the list contains a certain string
    System.out.println(arr.contains("david"));
    System.out.println();
    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    // Sort the list using the Collections library
    Collections.sort(arr);
    // Iterate over the list using a for-each loop
    // Print each value on a second line
    System.out.println();
    for(int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}