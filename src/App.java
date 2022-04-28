public class App {
    final static int FIBONACCI_LENGTH = 13;
    final static int NUMBER_TEST = 6;
    public static void main(String[] args) {
        System.out.println();
        runFibonacci();
        testPrime();
        testPalindrome();
        findFactorial();
        testArmstrong();
        System.out.println();
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
        if(prime.isPrime(NUMBER_TEST)){
            System.out.println(NUMBER_TEST+" is a prime number.");
        } else {
            System.out.println(NUMBER_TEST+" is not a prime number.");
        }
    }

    //Palindrome Number Test
    public static void testPalindrome(){
        PalindromeNumber palin = new PalindromeNumber();
        if(palin.isPalindrome(NUMBER_TEST)){
            System.out.println(NUMBER_TEST+" is a palindrome number.");
        } else {
            System.out.println(NUMBER_TEST+" is not a palindrome number.");
        }
    }

    //Factorial
    public static void findFactorial(){
        Factorial facty = new Factorial();
        System.out.println("Non-recursive factorial of "+NUMBER_TEST+": "+facty.loopFactorial(NUMBER_TEST));
        System.out.println("Recursive factorial of "+NUMBER_TEST+": "+facty.recFactorial(NUMBER_TEST));
    }

    //Armstrong Number Test 
    public static void testArmstrong(){
        ArmstrongNumber amsty = new ArmstrongNumber();
        if(amsty.isArmstrong(NUMBER_TEST)){
            System.out.println(NUMBER_TEST+" is armstrong number.");
        } else {
            System.out.println(NUMBER_TEST+" is not an armstrong number.");
        }
    }
}
