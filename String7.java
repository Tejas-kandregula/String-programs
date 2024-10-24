/*
You are given two strings, s and t . Your task is to determine if it's 
possible to rearrange the characters of s to form the string t . 
Write a function that returns True it's possible to create t by 
rearranging the characters of s and False otherwise. 

Input 
Two strings, s and t where the length of s and t are between 1 and 
1000 characters. 

Output 
Return True if it's possible to create t by rearranging the characters of 
s and False otherwise 

Example: 
s="listen" 
t="silent" 

Output: 
True

*/


import java.util.*;
public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String a = s.toLowerCase();
        String b = t.toLowerCase();
        System.out.println(strEqual(a, b));
        
    }
    public static boolean strEqual(String a, String b )
    {
        boolean q=false;
        if(a.length()==b.length())
        {
        char e[] = new char[a.length()];
        char f[] = new char[b.length()];
        for(int i=0;i<=e.length-1;i++)
        {
             e[i] = a.charAt(i);
        }
        for(int j=0;j<=f.length-1;j++)
        {
            f[j] = b.charAt(j);
        }
        Arrays.sort(e);
        Arrays.sort(f);
        int index=0;
        for(int i=0;i<=e.length-1;i++)
        {
            if(e[i]==f[index])
            {
                 q=true;
                 index++;
            }
        }
        }
        return q;
    }
    
}
