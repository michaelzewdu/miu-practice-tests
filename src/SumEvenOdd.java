// Feb 25 2023
// Michael Zewdu
// 2 out of 48 done
public class SumEvenOdd {
    int f(int[]a){
        int oddSum = 0;
        int evenSum = 0;
        for (int index = 0; index < a.length; index++) {
            if(a[index] % 2 ==0){
                evenSum += a[index];
            } else {
                oddSum += a[index];
            }
        }
        System.out.printf("The odd sum is: %d\n",oddSum);
        System.out.printf("The even sum is: %d\n",evenSum);
        System.out.printf("The sum is: %d\n",oddSum - evenSum);

        return oddSum - evenSum;
    }
}
