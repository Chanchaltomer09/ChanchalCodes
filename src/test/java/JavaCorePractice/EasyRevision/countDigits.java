package JavaCorePractice.EasyRevision;

import java.net.StandardSocketOptions;
import java.util.HashMap;
import java.util.Map;

/*Find the number of digits of ‘n’ that evenly divide ‘n’.

  Note:
  A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.
  Example:
  Input: ‘n’ = 336
  Output: 3
  Explanation: 336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.

  */
  public class countDigits {

       public static void main (String args[])
       {
           int n= 336;
        int rem=0,num=n, count=0;
        Map<Integer,Integer> map = new HashMap<>();
        while(n>0)
        {
            rem= n%10;
            if(map.containsKey(rem))
            {
                map.put(rem,map.get(rem)+1);
            }
            else
            {
                map.put(rem,1);
            }
            n=n/10;
        }
        for(int item : map.keySet())
        {    if(item ==0)
        {   continue;}
        else if(num %item==0)
        {
            count += map.get(item);
        }
        }
        System.out.println("count ="+ count);
    }
}
