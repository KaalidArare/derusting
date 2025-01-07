import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
     // Create a HashSet of Strings and assign it to a variable of type Set
        HashSet<String> stringSet = new HashSet<String>();

        // Add 3 elements to the set
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");

        // Check whether the Set contains a given String
        String checkElement = "Banana";
        if (stringSet.contains(checkElement)) {
            System.out.println("The set contains: " + checkElement);
        } else {
            System.out.println("The set does not contain: " + checkElement);
        }

        // Remove an element from the Set
        stringSet.remove("Apple");
        System.out.println("After removal " + stringSet);

        // Get the size of the Set
        int setSize = stringSet.size();
        System.out.println("Size of the set: " + setSize);

        // Iterate over the elements of the Set, printing each one on a separate line
        System.out.println("Elements in the set:");
        for (String element : stringSet) {
            System.out.println(element);
        }

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
