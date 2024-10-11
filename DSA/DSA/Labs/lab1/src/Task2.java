import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {

        int [][] twoarray = {{20,45,67,5,4},{3,5,4,89,90},{12,21,34,43,56},{78,87,96,58,42}};
        int [] onearray = new int[20];
        Task2.noDup(twoarray,onearray);
        System.out.println(Arrays.toString(onearray));

    }

            public static void noDup(int[][] twoDArray, int[] oneDArray) {
                int index = 0;

                for (int i = 0; i < twoDArray.length; i++) {
                    for (int j = 0; j < twoDArray[i].length; j++) {
                        boolean isUnique = true;

                        for (int k = 0; k < index; k++) {
                            if (twoDArray[i][j] == oneDArray[k]) {
                                isUnique = false;
                                break;
                            }
                        }

                        if (isUnique && index < oneDArray.length) {
                            oneDArray[index++] = twoDArray[i][j];
                        }
                    }
                }
            }









}
