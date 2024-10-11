import java.util.Scanner;
public class Simplerecurssion { public static void printseriesaccending(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return ;
        }
     printseriesaccending(n-1);
        System.out.println(n);
    }
    public static void printseriesdeccending(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        printseriesdeccending(n-1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print");
        int n = sc.nextInt();
        Simplerecurssion.printseriesaccending(n);
        Simplerecurssion.printseriesdeccending(n);




    }

}
