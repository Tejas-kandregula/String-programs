//JAVA STRING PROGRAM TO PRINT SUM OF DIGITS
import java.util.*;
public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch= s.charAt(i);
            if(ch>='0'&& ch<='9')
            count++;
        }
        int [] a = new int[count];
        int j=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
            a[j] = s.charAt(i)-'0';
            j++;
            }
        }
        System.out.println(sumString(a));
    }
    public static int sumString(int [] a)
    {
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }
}
