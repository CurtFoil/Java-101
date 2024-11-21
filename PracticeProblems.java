public class PracticeProblems {
    static int countOccurrences(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == n) {
                count++;
            }
        }
        return count;
    }

    // static int[] reverseArray(int[] arr) {
    //     int[] rArry = new int[arr.length];
    //     for (int i = 0; i < arr.length; i++) {
    //         rArry[i] = arr[arr.length - 1 - i];
    //     }
    //     return rArry;
    // }

    // static double sum2d(double[][] grid) {
    //     double sum = 0.0;
    //     for (int i = 0; i < grid.length; i++) {
    //         for (int j = 0; j < grid[i].length; j++) {
    //             sum += grid[i][j];
    //         }
    //     }
    //      return sum;  
    // }

    //     static int fib(int n){
    //     int a = 0;
    //     int b = 1;
    //     int c = 0;
    //     for (int i = 2; i <= n; i++) {
    //         c = a + b; 
    //         a = b;
    //         b = c;
    //     }
    //     return c;
    // }

    static void reverseArray(int[] arr){
        
    }
}
