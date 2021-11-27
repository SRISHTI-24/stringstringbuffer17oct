import java.util.Scanner;
public class combine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] a = s.next().toCharArray();
        char[] b = s.next().toCharArray();
        int l = a.length;
        int l1 = b.length;
        if(l>l1)
        {
            for(int i=0;i<l;i++)
            {
                System.out.print(a[i]);
                System.out.println(b[i]);
            }
        }
        else
        {
            for(int i=0;i<l1;i++)
            {
                System.out.print(a[i]);
                System.out.print(b[i]);
            }
        }


    }
}
