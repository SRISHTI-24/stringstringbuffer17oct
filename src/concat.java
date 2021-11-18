import java.util.Scanner;
public class concat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String str1 = s.next();
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        if(str.charAt(str.length()-1)==str1.charAt(0))
        {
            sb.append(str1.substring(1,str1.length()));
        }
        else
        {
            sb.append(str1);
        }
        System.out.println(sb);
        sb.append(str);
    }
}
