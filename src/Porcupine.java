public class Porcupine {

    int findPorcupineNumber(int n) {
        int currentPrimeNumber = 2;
        int previousPrimeNumber = 2;
        int porcupineNo = 0;
        int currentNumber = n + 1;
        if (n < 3) currentNumber = 3;
        boolean foundPorcupine = false;
//        int index = 0;

        for (int index = 2; !foundPorcupine; index++) {
            System.out.println(currentNumber);
            if (currentNumber == index) {
                previousPrimeNumber = currentPrimeNumber;
                currentPrimeNumber = index;
                currentNumber++;
                index = 1;
            }

            if (currentPrimeNumber % 10 == 9 && previousPrimeNumber % 10 == 9) {
                porcupineNo = currentPrimeNumber;
                foundPorcupine = true;
                return previousPrimeNumber;
            }

            if (currentNumber % index == 0) {
                currentNumber++;
                index = 1;
            }
        }
        return 0;


    }
}
