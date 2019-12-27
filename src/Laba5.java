import java.util.Arrays;

public class Laba5 {
    public static void main(String[] args) {
/**
 * This is prototype for Lab 4.
 */
        // PART 1
        // 1.1)
        float[] firstArray; // TODO init it's array by new with size 4.
        firstArray = new float[4];

        // TODO insert some value to start of array and to end of array.
        firstArray[0] = 5;
        firstArray[3] = 10;

        int[] intArray = {4, 3, 2, 1};
        ; // TODO init and fill it's array with any values. Use {} syntax.
        // 1.2)
        int[] intArrayCopy = {}; // TODO copy "intArray". Use copyOf...
        intArrayCopy = Arrays.copyOf(intArray, 4);
        // 1.3)
        // TODO sort "intArrayCopy", use Arrays sort.
        System.out.println("До sort : " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("После sort : " + Arrays.toString(intArray));

        // 1.4)
        // TODO print "intArrayCopy", use Arrays toString.
        System.out.println("print \"intArrayCopy\", use Arrays toString.");
        System.out.println(Arrays.toString(intArrayCopy));

        // 1.5)
        // TODO compare "intArray"  and "intArrayCopy", use Arrays equals. Print "Arrays equals" or "Arrays not equals".
        System.out.println(Arrays.equals(intArray, intArrayCopy) ? "Arrays equals" : "Arrays not equals");
        // PART 2
        int[] testArray = {1, 3, 5, 7, 8, 6, 4, 2, 0};

        // Print array values in cycle.
        for (int value : testArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 2.1)
        // TODO calc sum of all array elements and print result.
        int res = 0;
        for (int i = 0; i < testArray.length; i++) {
            res += testArray[i];
        }
        System.out.println("sum fori " + res);
        res = 0;
        for (int val : testArray
        ) {
            res += val;
        }
        System.out.println("sum foreach " + res);

        // 2.2)
        // TODO calc sum of all numbers with odd indexes and print result.
        res = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(testArray[i] + " ");
                res += testArray[i];
                if (i != testArray.length - 1) System.out.print("+ ");
            }
        }
        System.out.println("\nsum of all numbers with odd indexes  " + res);

        // 2.3)
        // TODO find max value in array.
        res = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            if (res < testArray[i]) res = testArray[i];
        }
        System.out.println("max value in array " + res);
        // PART 3

        //3.1
        // TODO create two-dimensional array with size [3][4]
        System.out.println("create two-dimensional array with size [3][4]");
        int[][] arr = new int[3][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //3.2
        // TODO fill array with any numbers in cycles.
        System.out.println("fill array with any numbers in cycles");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i * arr[i].length + j;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //3.3
        // TODO calc sum of all array elements and print result.
        res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res += arr[i][j];
            }
        }
        System.out.println("\ncalc sum of all array elements and print result" + "\n result - " + res);

        // PART 4*

        long[][] matrix = new long[9][9];
        long max = 0, min = 1000;
        int ratio = 0;
        for (long[] row : matrix) {
            Arrays.fill(row, ++ratio);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i < matrix.length; i++) {
            if (!(i > 2 && i <= 5)) continue;
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j + 1) % 3 == 0) {
                    if (max < matrix[i][j]) max = matrix[i][j];
                    if (min > matrix[i][j]) min = matrix[i][j];
                }
            }
        }

        int sum = 0;
        // TODO* calc sum only max and min values of matrix by expression: 2 < i <= 5 and only every third j value.
        System.out.println("\nmax = " + max
                + "\nmin = " + min
                + "\n" + max + " + " + min + " = " + (max + min));
    }
}
