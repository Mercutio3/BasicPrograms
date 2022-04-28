public class App {
    final static int FIBONACCI_LENGTH = 13;
    final static int NUMBER_TEST = 241;
    public static void main(String[] args) {
        runFibonacci();
        testPrime();
    }

    //Fibonacci Sequence
    public static void runFibonacci(){
        Fibonacci fibby = new Fibonacci();
        fibby.printSequence(FIBONACCI_LENGTH);
        fibby.printSequenceRec(FIBONACCI_LENGTH);
    }

    //Prime Number Test
    public static void testPrime(){
        PrimeNumber prime = new PrimeNumber();
        System.out.println(NUMBER_TEST+" is a prime number: "+prime.isPrime(NUMBER_TEST));
    }
}
