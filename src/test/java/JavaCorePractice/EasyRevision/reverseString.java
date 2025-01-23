package JavaCorePractice.EasyRevision;

import java.util.Arrays;

public class reverseString {
    public static void main(String args[])
    {
        String str = "reverse me right";
        System.out.println(str);
         reverseString(str);

    }
    public static void reverseString(String str)
    {   //method 1 :

        /*String reverse="";

        for(int i=0 ; i< str.length();i++)
        {
            reverse = str.charAt(i)+ reverse;
        }
        str = reverse;
        System.out.println(str);

         */

        //method 2
        int left=0 , size=str.length();
        int right=size-1;

        // Using StringBuilder for mutability
        StringBuilder sb = new StringBuilder(str);

        if(size==0)
        {System.out.println("Empty string");
            System.out.println(str);}
        else
        {
            while(left<right)
            {
                char temp = str.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++ ; right--;
            }
            str = sb.toString();
            System.out.println("reversed string : "+ str);
        }
    }
}
