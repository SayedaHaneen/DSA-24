import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value");
        int N = sc.nextInt();

        long starttime = System.nanoTime();
        System.out.println(Factorial.factorialIterative(N));
        long endtime = System.nanoTime();
        long timeiterative = endtime-starttime;
        System.out.println("time for iterative"+timeiterative);


        long starttime1 = System.nanoTime();

        System.out.println( Factorial.factorialRecursive(N));
        long endtime1 = System.nanoTime();
        long timerecursive = endtime1-starttime1;
        System.out.println("time for recursive"+timerecursive);

        if(timerecursive<timeiterative);
        {
            System.out.println("recurive is faster");
            System.exit(0);
        }
        {
            System.out.println("iterative is faster");
        }




    }
    public static long factorialIterative(int n)
    {
        long result1 = 1;
        for(int i=1;i<=n;i++)
        {
            result1*=i;
        }
        return result1;
    }
    public static long factorialRecursive(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorialRecursive(n-1);
    }

}
