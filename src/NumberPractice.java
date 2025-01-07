public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeFloat = -12.34f;
    System.out.println("Negative float: " + negativeFloat);

    // Create an int with a positive value and assign it to a variable
    int positiveInt = 25;
    System.out.println("Positive int: " + positiveInt);

    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainderWhenDividedBy3 = positiveInt % 3;
    System.out.println("Remainder when " + positiveInt + " is divided by 3: " + remainderWhenDividedBy3);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    if (positiveInt % 2 == 0) {
        System.out.println(positiveInt + " is Even");
    } else {
        System.out.println(positiveInt + " is Odd");
    }

    // Divide the number by another number using integer division
    int divisor = 4;
    int result = positiveInt / divisor;
    System.out.println("Result of integer division (" + positiveInt + " / " + divisor + "): " + result);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
