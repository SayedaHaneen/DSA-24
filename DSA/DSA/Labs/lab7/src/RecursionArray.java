public class RecursionArray { public static void printrecursiveforwad(int arr[], int index)
    {
        if(index== arr.length)
        {
            return;
        }
        System.out.println(arr[index]);
        printrecursiveforwad(arr,index+1);
    }
    public static void printrecursivereverse(int arr[], int index)
    {
        if(index== arr.length)
        {
            return;
        }
        printrecursivereverse(arr,index+1);
        System.out.println(arr[index]);
    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5};
        RecursionArray.printrecursiveforwad(array,0);
        RecursionArray.printrecursivereverse(array,0);
    }

}
