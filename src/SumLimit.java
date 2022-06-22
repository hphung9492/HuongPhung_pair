/**
 * class name:
 * author: Write your Name  (1) add your name
 * version:
 * description: MUST USE WHILE LOOP --> instead of using converting integer to
 * String, count the number of digits.
 * Given 2 non-negative ints, a and b,
 * return their sum, so long as the
 * sum has the same number of digits as a.
 * If the sum has more digits than a, just return a without b.
 */
public class SumLimit {

    public static void main(String[] args) {
        SumLimit sl = new SumLimit();
        System.out.println(sl.sumLimit(2, 3)); //this will yield 5
        System.out.println(sl.sumLimit(123,1));//this will be 124
        System.out.println(sl.sumLimit(23,80));//this will be 23

    }

    public int sumLimit(int a, int b) {
        int sum = 0;
        while (sum < a)  //this time, revise your code with version 2. also make
            // sure make space. Check history.

        {
            sum += a+b;
            String sum1 = Integer.toString(sum);
            String a1 = Integer.toString(a);
            if (sum1.length() <= a1.length())
            {
                return sum;
            }
            else {
                return a;
            }
        }
        return sum;

        //use while loop to complete this method.  You can use multiple loops, if you need.

    }

}
