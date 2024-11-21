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

    static int[] reverseArray(int[] arr) {
        int[] rArry = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rArry[i] = arr[arr.length - 1 - i];
        }
        return rArry;
    }

    static double sum2d(double[][] grid) {
        double sum = 0.0;
        for (int i = 0; i < grid.length; i++) {
            for (int a = 0; a < grid[i].length; a++) {
                sum += grid[i][a];
            }
        }
         return sum;  
    }

        static int fib(int n){
            if (n<0){
                throw new IllegalArgumentException("The value can not be a negative integer"); //I got this information form the internet. It felt appropriate to add an error code if the value the user is trying to insert is below 0(Negative value)
            }else if(n==0){
                return 0;
            } else if(n==1){
                return 1;
            }
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b; 
                a = b;
                b = c;
            }
            return c;
    }
}
