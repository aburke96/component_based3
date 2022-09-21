package utils;
import java.util.Iterator;
import java.util.Set;

public interface IntUtils_Burke 
{

    public static boolean isEven(int k) 
    {
        return (k % 2 == 0);
    }

    public static boolean isOdd(int k) 
    {
        return (k % 2 == 1);
        }

    public static boolean isPrime(int k) 
    {
        for (int i = k-1; i >= 2; i--) 
        {
           if (k % i == 0)
               return false;
        }
            return true;
       }

    public static int greatestCommonFactor(int m, int n) 
    {
        for (int i = n; i >= 1; i--) 
        {
            if (m % i == 0 && n % i == 0)
                return i;
        }
        return 1;
        }

    public static int getGreatestConstrainedMultiple(int k, int maximum) 
    {
        for (int i = maximum; i >= k; i--) 
        {

            if (i % k == 0) 
            {
                return i;
            }
        }
        return k;
        }

    public static int getIntegerH(int h_q_3, int h_r_5) 
    {
        return h_q_3 / 3 + h_r_5 % 5;
     }

    public static int getMaximum(Set<Integer> integerSet) 
    {
        Iterator<Integer> it = integerSet.iterator();
        int maximum = it.next();
        while (it.hasNext()) 
        {
            Integer current = it.next();
            if (current > maximum) 
            {
                maximum = current;
            }
        }
        return maximum;
        }

    public static int getMinimum(int[] intArray) 
    {
        int minimum = intArray[0];
        for (int i = 1; i < intArray.length; i++) 
        {
            if (intArray[i] < minimum) 
            {
                minimum = intArray[i];
            }
        }
        return minimum;
        }

    public static boolean isSorted(int[] intArray) 
    {
        for(int i = 0; i < intArray.length-1; i++) 
        {
            if (intArray[i] > intArray[i+1]) 
            {
                return false;
            }
        }
        return true;
        }

    public static int getSmallestIndexOfMatch(int[] intArray, int target) 
    {
        for(int i = 0; i < intArray.length-1; i++) 
        {
            if (intArray[i] == target) 
            {
                return i;
            }
        }
        return -1;
        }

    public static int reverse(int k) 
    {
        String ans = "";
        while (k % 10 != 0) 
        {
            ans += String.valueOf(k % 10 );
            k = k / 10;
        }
        return Integer.parseInt(ans);
        }

    public static int sumthing(long k) 
    {
        int ans = 0;
        while (k % 10 != 0) 
        {
            ans += (k % 10 );
            k = k / 10;
        }
        return ans;
        }
}