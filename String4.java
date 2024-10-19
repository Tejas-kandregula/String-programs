// JAVA PROGRAM TO CONVERT STRING TO UPPER AND LOWER CASE
import java.util.*;
public class String4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z') // if(ch>='A' && ch<='Z')
            {
                ch = (char)(ch-32); // ch = (char)(char+32);
                a = a+ch;
            }
        }
        System.out.println(a);
    }
    
}
