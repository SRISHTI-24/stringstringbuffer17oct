import java.util.Scanner;
public class copystring {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      char[] a = s.next().toCharArray();
      int n = a.length;
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<=1;j++)
          {
              System.out.print(a[j]);
          }
      }
    }
}
