public class Main {
    // static int x = 6;
    // static double[] arr = {4.5, 6, 9.0, 8};
    // static boolean[] arr = new boolean[100];
    // static int[][] board = new int[3][3];
    // static double f(double x) {
    //     return 2 * x;
    // }
    // static void printIntArray(int[] arr) {
    //     String str = "(";
    //     for (int i = 0; i < arr.length; i++) {
    //         str += arr[i];
    //         if (i != arr.length - 1) {
    //             str += ", ";
    //         }
    //     }
    //     str += ")";
    //     System.out.println(str);
    // }
    // public static void main(String[] args){
    //     int[] myArray = {15, 26, 12, 17, 55, 22, 108};
    //     printIntArray(myArray);
    //     System.out.println(myArray);
    // }
    static String intArrToString(int[] arr) {
        String str = "(";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ", ";
            }
        }
        return str + ")";
    }
    public static void main(String[] args){
        // System.out.println("Hello world");
		// System.out.println("x: " + x);
		// x = x + 4;
		// System.out.println("new x: " + x);
        // System.out.println(arr[0]);
        // arr[3] = true;
        // System.out.println(arr[0] || arr[3]);
        // System.out.println(arr.length);

        // int x = 3;
        // board[0][0] = 5;
        // int firstVal = board[0][0];
        // System.out.println(firstVal);
        // System.out.println("f(3): " + f(x));

        // int[] arr = {1, 4, 6, 9};
	    // System.out.println(intArrToString(arr));

        int[] x = {7, 15, 22, 7, 34, 15, 42, 7, 18, 22};
        double[][] y = {{2, 8, 3}, {3, 6, 4}};
        System.out.println(PracticeProblems.countOccurrences(x, 22));
        System.out.println(intArrToString(PracticeProblems.reverseArray(x)));
        System.out.println(PracticeProblems.sum2d((y)));
        System.out.println(PracticeProblems.fib(165));

    }
}