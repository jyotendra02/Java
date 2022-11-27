import java.util.Scanner;

public class butterfly {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 2*n;
        for(int i = 1;i<=2*n;i++)
        {
            if(i<=n)
            {
                for(int j = 1; j<=d;j++)
                {
                    if(j<=i || j>d-i)
                     System.out.print("* ");
                    else
                     System.out.print("  ");
                }
                System.out.println();
            }
            else
            {
                for(int j = 1; j<=d;j++)
                {
                    if(j<=d-i+1 || j>=i  )
                     System.out.print("* ");
                    else
                     System.out.print("  ");
                }System.out.println();
            }
        }
    }
    
}
