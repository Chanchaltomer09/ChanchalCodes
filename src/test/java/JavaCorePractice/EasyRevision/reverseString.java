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
    {   String reverse="";

        for(int i=0 ; i< str.length();i++)
        {
            reverse = str.charAt(i)+ reverse;
        }
        str = reverse;
        System.out.println(str);
    }
}
