
import java.util.Scanner;

public class pattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows.");
        //Floyd's Triangle
        int n = sc.nextInt();
        int count  =1;
        for(int i =1;i<=n;i++)
        {
            for(int j = 1 ; j<=i;j++)
             System.out.print(count++ + " ");

            System.out.println();
        }
        System.out.println();
        //01 triangle
        for(int i =1;i<=n;i++)
        {
            for(int j = 1 ; j<=i;j++)
             {
                if((i+j)%2==0)
                 System.out.print("1 ");
                else
                 System.out.print("0 "); 
             }

            System.out.println();
        }


        sc.close();

    }
}
