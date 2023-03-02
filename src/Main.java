public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the MIU practice tests solutions");

        PrimeCount primeC = new PrimeCount();
        System.out.printf("Start: 10, end: 30, result: %d \n", primeC.primeCount(10,30));
        System.out.printf("Start: 11, end: 29, result: %d \n", primeC.primeCount(11,29));
        System.out.printf("Start: 20, end: 22, result: %d \n", primeC.primeCount(20,22));
        System.out.printf("Start: 1, end: 1, result: %d \n", primeC.primeCount(1,1));
        System.out.printf("Start: 5, end: 5, result: %d \n", primeC.primeCount(5,5));
        System.out.printf("Start: 6, end: 2, result: %d \n", primeC.primeCount(6,2));
        System.out.printf("Start: -10, end: 6, result: %d \n", primeC.primeCount(-10,6));

    }

}