package JavaCorePractice.EasyRevision;

public class reverseStringWithSpecialCharacter {

    public static void main(String args[]) {
        String str = "Ab,c,de!$";// Output:  str = “ed,c,bA!$”
        //reverse(str);
        String a = "&1a,bh23^G%%bg";
        reverse2(a);

    }

    public static void reverse(String a) {
        char str[] = a.toCharArray();
        int right = str.length - 1, left = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (left < right) {
            // Ignore special characters
            if (!Character.isAlphabetic(str[left]))
                left++;
            else if (!Character.isAlphabetic(str[right]))
                right--;

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[left];
                str[left] = str[right];
                str[right] = tmp;
                left++;
                right--;
            }
        }
        a= new String(str);
        System.out.println("reversed string = "+ a);
    }

    public static void reverse2(String a) {
        char str[] = a.toCharArray();
        int right = str.length - 1, left = 0;

        // Traverse string from both ends until 'l' and 'r'
        while (left < right)
        {
            // Ignore special characters
            if (!(Character.isAlphabetic(str[left])) || !(Character.isDigit(str[left])))
            { left++;}
            else if (!(Character.isAlphabetic(str[right])) || !(Character.isDigit(str[left])))
            { right--;}

                // Both str[l] and str[r] are not spacial
            else {
                char tmp = str[left];
                str[left] = str[right];
                str[right] = tmp;
                left++;
                right--;
            }
        }
        String a1= new String(str);
        System.out.println("reversed string from rev 2 = "+ a1);
    }
}
