package JavaCorePractice.EasyRevision;

public class reverseWords {
    public static void main(String args[])
    {
        String str = "I am John Doe";
        System.out.println(str);
        reverseWordsOfString(str);

    }
    public static void reverseWordsOfString(String str)
    {   String reverse="";

        for(int i=0 ; i< str.length();i++)
        {
            reverse = str.charAt(i)+ reverse;
        }
        str = reverse;
        System.out.println(str);
    }
}
