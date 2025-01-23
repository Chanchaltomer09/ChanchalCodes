package JavaCorePractice.EasyRevision;

public class reverseStringWithSpecialCharacter {

    public static void main(String args[]) {
        String str = "Ab,c,de!$";// Output:  str = “ed,c,bA!$”
        reverse2(str);
        //String a = "&1a,bh23^G%%bg";
       // reverse2(a);

    }

    public static void reverse2(String str) {
        char str1[] = str.toCharArray();
        int right = str.length()-1, left = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (left < right)
        {
            // Ignore special characters
            if (!(Character.isAlphabetic(str1[left])))
            left++;
            else if ((Character.isAlphabetic(str1[right])))
            right--;

                // Both str[l] and str[r] are not spacial
            else {
                char temp = str1[left];
                str1[left] = str1[right];
                str1[right] = temp;
                left++;
                right--;
            }
        }
        String a1= new String(str1);
        System.out.println("reversed string from rev 2 = "+ a1);
    }
}
