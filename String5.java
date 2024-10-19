// JAVA PROGRAM TO REVERSE THE EACH INDEX VALUE IN A STRING
import java.util.*;
public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            count++;
        }
        System.out.println(Arrays.toString(revrse( s, count)));
    }
    public static char []  revrse(String s, int count)
    {
        char [] a = new char[count];
        for(int i=0;i<=s.length()-1;i++)
        {
            a[i] = s.charAt(i);
        }
        char [] b = new char[count];
            int i=0;
            for(int j=count-1;j>=0;j--)
            {
                b[i] = a[j];
                i++;
            }
        
        return b;
    }
    
}
