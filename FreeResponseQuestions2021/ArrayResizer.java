package FreeResponseQuestions2021;

public class ArrayResizer {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 0},
                       {1, 3, 2},
                       {0, 0, 0},
                       {4, 5, 6}};

        System.out.println(isNonZeroRow(arr, 0));
        System.out.println(isNonZeroRow(arr, 1));
        System.out.println(isNonZeroRow(arr, 2));
        System.out.println(isNonZeroRow(arr, 3));

        int[][] smaller = resize(arr);
        for (int[] rows : smaller) {
            for (int value : rows) {
                System.out.print(value + " ");
            }
            System.err.println();
        }
    }

    public static boolean isNonZeroRow(int[][] array2D, int r) {
        for (int value : array2D[r]) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows(int[][] array2D) {
        int result = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                result++;
            }
        }
        return result;
    }

    public static int[][] resize(int[][] array2D) {
        if (numNonZeroRows(array2D) == array2D.length) {
            return array2D;
        }
        int rows = numNonZeroRows(array2D);
        int[][] result = new int[rows][];
        int cur = 0;
        for (int i = 0; i < rows; i++) {
            while (!isNonZeroRow(array2D, i + cur)) {
                cur++;
            }
            result[i] = array2D[i + cur];
            cur++;
        }
        return result;
    }
}
