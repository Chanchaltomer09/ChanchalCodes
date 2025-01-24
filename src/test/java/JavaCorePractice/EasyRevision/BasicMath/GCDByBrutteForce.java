package JavaCorePractice.EasyRevision.BasicMath;

public class GCDByBrutteForce {
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.print("GCD of " + a + " and " + b
                + " is " + gcd(a, b));
    }
    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        // Find Minimum of a and b
        int i = Math.min(a, b);
        while (i > 0)
        {
            if (a % i == 0 && b % i == 0)
            {  break;
            }
            i--;
        }

        return i;
    }
}
// Time Complexity: O(min(a,b))
// Auxiliary Space: O(1)