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
        int countA = 0;
        int countSum = 0;
        int aDigits = a;
        while (aDigits!=0)
        {
            aDigits = aDigits/10;
            countA++;
        }
        while (sum < a)
        {
            sum += a + b;
            int sumDigits = sum;
            while(sumDigits!=0)
            {
                sumDigits = sumDigits/10;
                countSum++;
            }
            if (countSum<=countA)
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
