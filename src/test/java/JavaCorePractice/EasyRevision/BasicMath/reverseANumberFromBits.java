package JavaCorePractice.EasyRevision.BasicMath;

/*For example : If the given number is N = 12 is represented as 00000000000000000000000000001100 in its binary representation.
        So after reversing the bits, it will become 0110000000000000000000000000000, which is equal to 805306368 only.
        So the output is 805306368.

 */

import java.util.Scanner;

public class reverseANumberFromBits {
 public static void main(String args[])
 {
     int n=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your number :");
     n = sc.nextInt();
     String bits = Long.toBinaryString(n);
     bits = String.format("%32s", bits).replaceAll(" ", "0");
     //System.out.println("Binary string "+bits);
     StringBuilder input = new StringBuilder(bits);
     StringBuilder reversed = input.reverse();
     String reverseBinary = new String(reversed);

     // System.out.println(" Reverse Binary string "+reverseBinary);
     long reverseNbr = Long.parseLong(reverseBinary,2);

     System.out.println("reversed number is ="+ reverseNbr);

 }
 }

