// JAVA PROGRAM TO COUNT ALL THE ELEMENTS IN THE STRING
import java.util.*;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        int a=0;
        int num =0;
        int sym=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch = s.charAt(i);
            count++;
            if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z'))
            {
                a++;
            }
            else if(ch>='0' && ch<='9')
            {
                num++;
            }
            else
            sym++;
        }
        System.out.println(count);
        System.out.println(a);
        System.out.println(num);
        System.out.println(sym);

    }
    
}
