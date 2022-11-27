import java.util.Scanner;

public class oddsum {
    public static int printOddSum(int n)
    {
        int sum = 0;
        for(int i = 1;i<=n;i++)
        {
            if(i%2==0)
             continue;
            else
            sum +=i; 
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        System.out.println(printOddSum(num));
    }
    
}
