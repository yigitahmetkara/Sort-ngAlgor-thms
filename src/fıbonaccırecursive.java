
public class fıbonaccırecursive {
	 static int nthFibonacci(int n){
	        // Base case: if n is 0 or 1, return n
	        if (n <= 1) {
	            return n;
	        }
	        // Recursive case: sum of the two preceding
	        // Fibonacci numbers
	        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
	    }

	    public static void main(String[] args){
	        int n = 10;
	        int result = nthFibonacci(n);
	        System.out.println(result);
	    }
	}

