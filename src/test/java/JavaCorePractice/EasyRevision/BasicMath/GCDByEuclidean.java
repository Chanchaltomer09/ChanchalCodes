package JavaCorePractice.EasyRevision.BasicMath;

public class GCDByEuclidean {
    /*
    Pseudo-code: As per Euclidean algorithm
                 gcd(a, b):
                                if a = b: return a
                                if a==0 return b
                                if b==0 return a
                                if a > b: return gcd(a – b, b)
                                else:    return gcd(a, b – a)
     */
    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.println("GCD of " + a + " and " + b
                + " is " + gcd(a, b));
    }
    // Recursive function to return gcd of a and b
    static int gcd(int a, int b)
    {   // Everything divides 0
        if (a == 0) return b;
        if (b == 0) return a;
        // Base case
        if (a == b) return a;
        // a is greater
        if (a > b)
            return gcd(a - b, b);
        return gcd(a, b - a);
    }


}
