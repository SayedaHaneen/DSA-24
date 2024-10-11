import java.util.Scanner;
public class FaboUsingRecurIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of N");
        int N = sc.nextInt();
        long starttime = System.nanoTime();
        FaboUsingRecurIterative.faboiterative(N);
        long endtime = System.nanoTime();
        System.out.println("time for iterative is"+(starttime-endtime));

        long starttime1 = System.nanoTime();
        for(int i = 0 ; i<N ; i++)
        {
            System.out.println(   FaboUsingRecurIterative.faboRecursive(i));
        }
        long endtime1 = System.nanoTime();
        System.out.println("time for recursive is"+(starttime1-endtime1));

    }

    public static void faboiterative(int N)
    {
        int a=0 , b=1 ;

        for(int i = 0 ; i<N;i++)
        {
            System.out.println(a+"");
            int next = a+b;
            a=b;
            b=next;
        }
        System.out.println();

    }
    public static int faboRecursive(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return faboRecursive(n-1)+faboRecursive(n-2);
    }


}
