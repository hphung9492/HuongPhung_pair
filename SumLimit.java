/**
 * class name:
 * author: Write your Name
 * version:
 * description: MUST USE WHILE LOOP
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
        while (sum<a)
        {
            sum += a+b;
            String sum1 = Integer.toString(sum);
            String a1 = Integer.toString(a);
            if (sum1.length()<=a1.length())
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
