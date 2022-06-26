/**
 * //complete here
 *
 */

import java.util.Scanner;
public class MakeChocolate {
    private Scanner sc;
    public static void main(String[] args) {
        MakeChocolate mc = new MakeChocolate();
        mc.sc = new Scanner(System.in);
        System.out.println("Please enter a small integer: ");
        int small = mc.readNumber();
        System.out.println("Please enter a big integer: ");
        int big = mc.readNumber2();
        System.out.println("Please enter a goal integer: ");
        int goal = mc.readNumber3();
        System.out.println(mc.makeChocolate(small, big, goal));
        //create Scanner type object
        //Write a prompt to ask a user to enter small integer, big integer, and
        // goal integer.
        //then, call makeChocolate method and generate the output on the console
        // as an output.

    }


    //(2)create a method name readNumber as we practiced on Thursday in class.
    public int readNumber()
    {
        return sc.nextInt();
    }
    public int readNumber2()
    {
        return sc.nextInt();
    }
    public int readNumber3()
    {
        return sc.nextInt();
    }

    //(3)


    /**
     * (1)Please test your method with this link: https://codingbat.com/prob/p191363
     * Description: We want make a package of goal kilos of chocolate. We have small
     * bars(1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
     * makeChocolate(4, 1, 9) → 4
     * makeChocolate(4, 1, 10) → -1
     * makeChocolate(4, 1, 7) → 2
     * @param small
     * @param big
     * @param goal
     * @return
     */
    public int makeChocolate(int small, int big, int goal) {
        int sumBig = big*5;
        int smallNeeded = 0;
        int remainder = goal - sumBig;
        if(remainder>small)
        {
            smallNeeded = -1;
        }
        else if (remainder >= 0 && remainder<=small)
        {
            smallNeeded = remainder;
        }
        else if (remainder<0 && goal>4)
        {
            remainder = goal -5;
            if (remainder>small)
            {
                smallNeeded = -1;
            }
            else
            {
                smallNeeded = remainder;
            }
        }
        else if(remainder<0 && goal<=4)
        {
            smallNeeded = goal;
        }
        else
        {
            remainder = -1;
        }
        return smallNeeded;
        //complete here
    }

}
