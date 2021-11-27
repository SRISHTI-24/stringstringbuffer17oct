import java.util.Scanner;
public class lastthree {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        char[] a = s.next().toCharArray();
        int n = s.nextInt();
        int l = a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=l-n;j<l;j++)
            {
                System.out.print(a[j]);
            }
        }

    }
}
