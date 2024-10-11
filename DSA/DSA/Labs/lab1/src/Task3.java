

public class Task3{

    public void extractBoundaries(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Print first row
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }
        System.out.println();

        // Print first column
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][0] + " ");
        }
        System.out.println();

        // Print last row
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[rows - 1][j] + " ");
        }
        System.out.println();

        // Print last column
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }
        System.out.println();
    }

    public void cropCenterPart(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task3 nlArray = new Task3();
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Boundaries:");
        nlArray.extractBoundaries(arr);

        System.out.println("Center Part:");
        nlArray.cropCenterPart(arr);
    }
}
