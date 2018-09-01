public class FibonacciIterative implements Fibonacci{

	public int fibonacci(int n){
        int a = 0;
        int result = 1;
        for (int i = 1; i < n; i++) {
            int nextN = a + result;
            a = result;
            result = nextN;
        }
        return result;
    }
}
