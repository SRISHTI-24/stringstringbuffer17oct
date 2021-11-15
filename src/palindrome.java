import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
                String str = s.next();
        String rstr="";
        int l=str.length();
        for(int i=(l-1);i>=0;i--)
        {
            rstr = rstr + str.charAt(i);
        }
        if(str.toLowerCase().equals(rstr.toLowerCase()))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
