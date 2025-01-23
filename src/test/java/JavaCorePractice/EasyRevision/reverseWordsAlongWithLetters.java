package JavaCorePractice.EasyRevision;

public class reverseWordsAlongWithLetters {
    public static void main(String args[])
    {
        //String str = "I am John Doe";// output : e OD nhoJ maI
        String str = "Ab,c,de!$";
        System.out.println(str);
        reverseWordsOfString(str);
    }
    public static void reverseWordsOfString(String str)
    {
        char a[]=str.toCharArray();
        int left=0, right =str.length()-1;
        while(left<right)
        {
            if(!(Character.isAlphabetic(a[left])))
                left++;
            if(!(Character.isAlphabetic(a[right])))
                right--;
            else {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        String rev= new String(a);
        System.out.println("reversed string    : "+rev);
    }

}
