import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        // one way of creating arrays
        String[] stringsArray = new String[10];
        stringsArray[0] = "Hello World";
//        System.out.println(stringsArray[0]);

        // another way
        int[] intsArray = {1, 2, 3, 4, 5};
//        System.out.println(intsArray[0]);

        // multidimensional arrays
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };                    // row col
//        System.out.println(matrix[0][2]);
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);

        // copying arrays
        String[] copyFrom = {"Latte", "Matcha", "Espresso"};
        String[] copyTo = new String[copyFrom.length];

        // 1. Using System.arraycopy(src, srcPos, dest, destPos, numOfElemetns)
        // This method requires initializing the destination array
        System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
        for (String item : copyTo) {
            System.out.println(item);
        }

        System.out.println("----------------------");

        // 2. Using java.util.Arrays.copyOfRange(src, startIdx, endEdx) end is exclusive
        // this method will return the copied array
        String[] dest = Arrays.copyOfRange(copyFrom, 1, 2);
        for (String item : dest) {
            System.out.println(item);
        }
    }
}