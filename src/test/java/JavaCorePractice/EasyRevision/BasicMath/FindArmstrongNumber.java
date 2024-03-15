package JavaCorePractice.EasyRevision.BasicMath;

import java.util.Scanner;
/*An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power
        is equal to the number itself.For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.*/

public class FindArmstrongNumber {
    public static void main(String[] args) {
        // Write your code here
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        n = sc.nextInt();
        int temp=n;
        int count=0,sum=0,rem=0;

        while(n>0)
        {   n=n/10;
            count++;
        }
        n=temp;
        while(n>0)
        {
            rem= n%10;
            sum += Math.pow(rem, count);
            n=n/10;
        }
        if(count==1) System.out.println("true");
        else if(sum==temp) System.out.println("true");
        else System.out.println("false");
        sc.close();

    }
}
