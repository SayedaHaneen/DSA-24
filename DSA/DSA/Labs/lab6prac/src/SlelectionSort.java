public class SlelectionSort {
    public static void SelectionSorting(int arr[])
    {
        for(int i = 0;i<arr.length-1;i++)
        {
            int minposition=i;
            for(int j =i+1;j< arr.length;j++)
            {
                if(arr[minposition]>arr[j])
                {
                    minposition=j;
                }
            }
            int temp = arr[minposition];
            arr[minposition]=arr[i];
            arr[i]=temp;
        }
    }


    public static void main(String[] args) {
        int [] arr ={5,4,1,3,2};
        SlelectionSort.SelectionSorting(arr);

       for(int i = 0;i< arr.length;i++)
       {
           System.out.println(arr[i]);
       }

    }


}
