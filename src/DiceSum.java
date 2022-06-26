/**
 * Huong, make sure complete here.
 *
 */
/**
 * sample outputs(1)
 * Desired dice sum: 10
 * 1 and 5 = 6
 * 5 and 6 = 11
 * 5 and 6 = 11
 * 2 and 5 = 7
 * 2 and 2 = 4
 * 1 and 2 = 3
 * 3 and 6 = 9
 * 3 and 5 = 8
 * 3 and 1 = 4
 * 1 and 3 = 4
 * 2 and 6 = 8
 * 4 and 6 = 10
 *
 *
 * Sample(2)
 *Desired dice sum: 5
 * 3 and 1 = 4
 * 2 and 3 = 5
 *
 */

import java.util.Scanner;

public class DiceSum {
    private Scanner sc;

    public static void main(String[] args) {
        DiceSum ds = new DiceSum();
        ds.sc = new Scanner(System.in);
        ds.diceSum();
    }

    /**
     * method:desiredSum(Scanner input)
     * @param input
     * @return integer number
     * this method will take Scanner object.
     * This method will prompt a message "Desired dice sum: "
     * Then, this will retrieve the integer value.
     * Then, this method will return that integer value.
     * Write only up to three lines
     */
    public int desiredSum(Scanner input) {
      //complete here
    }

    /**
     * method: diceSum()
     * this method will create Random object (read this: https://docs.oracle
     * .com/en/java/javase/16/docs/api/java.base/java/util/Random.html)
     * This method will call desiredSum(sc) method. Please remember desiredSum()
     * method take one parameter and it is Scanner object.
     * Then,  then repeatedly rolls two six-sided dice until their sum is the
     * desired sum. Here is the expected dialogue with the user:
     */
    public void diceSum() {

        java.util.Random r = new java.util.Random();

        //complete here


    }
}