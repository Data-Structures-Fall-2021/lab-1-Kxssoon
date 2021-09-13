public class TaylorSeries {

    // YOUR CODE GOES HERE
    
    public static double pow(int x, int n){
        // base case anything to the power of zero is one
        if (n == 0){
            return 1;
        }
        // recursive function calculating the power ending with  * 1
        else{
            return x * pow(x, n - 1);
        }
    }

    public static double factorial(int n){
        // base case for the odd case of 0! = 1
        if (n <= 1){
            return 1;
        }
        // recursive function that multiplies counting down
        else{
            return n * factorial(n - 1);
        }
    }

    public static double approximateExp(int x, int numIterations){
        // combination of the two above-mentioned methods to produce this final one
        double estimate = 0.0;

        for (int q = 0; q < numIterations; q++){
            estimate += pow(x,q) / factorial(q);
        }
        return estimate;
    }


}
