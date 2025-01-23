package JavaCorePractice.EasyRevision;

public class reverseWords {
    public static void main(String args[])
    {
        String str = "I am John Doe"; // output : Doe John am I
        System.out.println(str);
        reverseWordsOfString(str);

    }
    public static void reverseWordsOfString(String str)
    {   String reverse="";
        String a[]= str.split("\\s");

        for(String item : a)
        {
            reverse = item + " "+reverse;
        }
        str = reverse.trim();
        System.out.println(str);
    }
}
