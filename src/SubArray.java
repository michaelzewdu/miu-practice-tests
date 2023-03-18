public class SubArray {
    int isSub(int[] a){

            int rightSum;
        // assume {13,6,3,2}
        for(int index = 0; index < a.length-2 ; index++){
            rightSum = 0;
            for (int subIndex = index+1; subIndex < a.length; subIndex++) {
                rightSum += a[subIndex];

            }
            System.out.printf("a[index] is: %d right sum is: %d\n", a[index], rightSum);
            if (a[index] <= rightSum) return 0;
        }

        return 1;

    }
}
