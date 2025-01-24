package JavaCorePractice.EasyRevision.BasicMath;

import java.util.Scanner;

public class Sumof1toNdivisors {
    //Given a positive integer n, The task is to find the value of Σi F(i)
     /* where i is from 1 to n and function F(i) is defined as the sum of all divisors of i.
    example :
    Input: n = 4
    Output: 15
    Explanation:
    F(1) = 1
    F(2) = 1 + 2 = 3
    F(3) = 1 + 3 = 4
    F(4) = 1 + 2 + 4 = 7
    So, F(1) + F(2) + F(3) + F(4)
        = 1 + 3 + 4 + 7 = 15 */
    public static int sumOfDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count = count + j;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter number");
        num=sc.nextInt();
        int sum= sumOfDivisors(num);
        System.out.println("Sum of all divisors from i= 1 to "+num+" is = "+sum);
    }
}
