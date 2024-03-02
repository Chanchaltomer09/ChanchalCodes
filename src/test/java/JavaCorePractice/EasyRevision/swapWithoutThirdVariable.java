package JavaCorePractice.EasyRevision;

public class swapWithoutThirdVariable {

    public static void main(String args[])
    {
        int a = 15;
        int b = 10;

        // TODO swap values of i and j without creating any variables

        a = a - b; // j = 15 - 10; j = 5
        b = b + a; // i = 10 + 5;  i = 15
        a = b - a; // j = 15 - 5;  j = 10

        System.out.println(a); // 10
        System.out.println(b); // 15
    }
}
