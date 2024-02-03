package JavaCorePractice.EasyRevision;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of fibonacci");
        int size=sc.nextInt();
        printFibonacci(size);
    }

    public static void printFibonacci(int size)
    {
        int f1=0, f2=1; int f3;
        if(size==1)
        {
            System.out.println(f1);
        } else if (size==2) {
            System.out.print(f1+"  "+f2);
        } else {
            System.out.print(f1+"  "+f2+" ");
            for (int i = 2; i < size; i++) {
                f3 = f1 + f2;
                System.out.print(f3+ " ");
                f1=f2;
                f2=f3;

            }
        }
    }
}
