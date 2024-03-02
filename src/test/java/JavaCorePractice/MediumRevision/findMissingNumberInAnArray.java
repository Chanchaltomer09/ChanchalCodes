package JavaCorePractice.MediumRevision;

public class findMissingNumberInAnArray {

    public static void main (String args[])
    {
        int arr[]= {1,2,4,5,6};
        int missing = missingNumber(arr,arr.length);
        System.out.println("missing = " + missing);
    }
    public static int missingNumber(int array[],int n)
    {
        int sum=0;
        for(int i=0; i< n-1;i++)
        {
            sum =sum+array[i];
        }
        return (n*(n+1)/2) - sum;
    }
}
