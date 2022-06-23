/**
 * complete this commented part
 */
public class SumLimit2 {
    //complete this version 2.
    //this time you DO NOT convert the integer values to String values.
    
    public static void main(String[] args) {
        SumLimit2 sl = new SumLimit2();
        System.out.println(sl.sumLimit(2, 3)); //this will yield 5
        System.out.println(sl.sumLimit(123,1));//this will be 124
        System.out.println(sl.sumLimit(23,80));//this will be 23
    }

    public int sumLimit(int a, int b) {
        int sum = 0;
        int counta = 0;
        int countsum = 0;
        int adigits = a;
        while (adigits!=0)
        {
            adigits = adigits/10;
            counta++;
        }
        while (sum<a)
        {
            sum += a+b;
            int sumdigits = sum;
            while(sumdigits!=0)
            {
                sumdigits = sumdigits/10;
                countsum++;
            }
            if (countsum<=counta)
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
