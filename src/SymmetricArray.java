// Michael Zewdu March 08 2023GC

import java.util.Arrays;

public class SymmetricArray {

    int isSym(int a[], int len){
        String[] evenOddTracker = new String[len];
        String[] evenOddTrackerReverse = new String[len];

        for (int index = 0; index < a.length; index++) {
            System.out.println(a[index]);
            if(a[index] % 2 == 0) evenOddTracker[index]= "Even";
            if(a[index] % 2 != 0) evenOddTracker[index]= "Odd";
        }
        System.out.println(Arrays.toString(evenOddTracker));

        for (int reverseIndex = a.length - 1, index =0; reverseIndex >= 0; reverseIndex-- ,index++) {
           // if(a[index] % 2 == 0 && evenOddTracker[index] != "Even") return 0;
           // if(a[index] % 2 != 0 && evenOddTracker[index] == "Even") return 0;
            if(a[reverseIndex] % 2 == 0) {
                evenOddTrackerReverse[index] = "Even";
                System.out.printf("Reverse Index: %d and %d : is Even\n",reverseIndex,a[reverseIndex]);
            }
            if(a[reverseIndex] % 2 != 0) {
                evenOddTrackerReverse[index] = "Odd";
                System.out.printf("Reverse Index: %d and %d : is Odd\n",reverseIndex,a[reverseIndex]);
            }

        }

        System.out.println(Arrays.toString(evenOddTrackerReverse));
        for (int index = 0; index < a.length; index++) {
            if( evenOddTracker[index] != evenOddTrackerReverse[index]) return 0;
        }

        return 1;

    }
}
