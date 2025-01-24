package JavaCorePractice.EasyRevision.BasicMath;

import java.util.Scanner;

public class checkPrimeNumber {
    public static void main(String args[])
    { int num=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        num = sc.nextInt();
        if(num==1)
            System.out.println("NO");
        int i=2;
        for (i = 2; i *i<=num; i++)
        { if (num % i == 0)
           {System.out.println("NO");
            break;
            }

        }
        if(i>=Math.sqrt(num))System.out.println("YES");


    }
}
