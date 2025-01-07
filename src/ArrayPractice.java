public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] num = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    num[0] = "kaalid";
    num[1] = "john";
    num[2] = "tyler";
    num[3] = "liban";

    // Get the value of the array at index 2
    System.out.println(num[1].toString());
    // Get the length of the array
    System.out.println(num.length);
    // Iterate over the array using a traditional for loop and print out each item
    System.out.println();
    for(int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    System.out.println();
    for(String n : num) {
      System.out.println(n);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
