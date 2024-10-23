// Problem Statement

// The function removespaces() accepts parameter string inp string Complete the function removespaces() by returning the string with spaces semoved in string format

// Example 1

// Input:

// inp_string=good day

// Output:

// goodday

import java.util.*;
public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       // System.out.println(removeSpaces(s));
       removeSpaces(s);
    }

   // public static String removeSpaces(String s)
   public static void removeSpaces(String s)
    {
    //    String a = s.replaceAll(" ", "");
    //    return a;
            int n = s.length();
            for(int i=0;i<=n-1;i++)
            {
                char ch = s.charAt(i);
                if(ch == ' ')
                {
                    continue;
                }
                else
                {
                    System.out.print(ch);
                }
            }
    }
}
