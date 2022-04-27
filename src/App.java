public class App {
    final static int FIBONACCI_LENGTH = 13;
    public static void main(String[] args) throws Exception {
        runFibonacci();
    }

    //Fibonacci Sequence
    public static void runFibonacci(){
        Fibonacci fibby = new Fibonacci(FIBONACCI_LENGTH);
        fibby.printSequence();
        fibby.printSequenceRec();
    }
}
