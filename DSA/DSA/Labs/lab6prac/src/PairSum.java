import java.util.Arrays;
public class PairSum {



        public static boolean hasPairWithSum(int[] arr, int K) {
            Arrays.sort(arr);
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int currentSum = arr[left] + arr[right];
                if (currentSum == K) {
                    System.out.println(arr[left]+"+"+arr[right]);
                    return true;
                } else if (currentSum < K) {
                    left++;
                } else {
                    right--;
                }
            }
            return false;
        }

        public static void main(String[] args) {
            int[] arr = {8, 4, 1, 6};
            int K = 10;
            System.out.println(hasPairWithSum(arr, K));
        }
    }


