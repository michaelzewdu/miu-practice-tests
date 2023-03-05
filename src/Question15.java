public class Question15 {

    int answerThree(int[] a){

        if (a.length % 2 != 0) return 0;

        int leftSum = 0;
        int rightSum = 0;
        int midPoint = a.length / 2;
        for (int index = 0; index < midPoint; index++) {
            leftSum += a[index];
        }
        for (int index = midPoint; index < a.length; index++) {
            rightSum += a[index];
        }

        if (leftSum == rightSum) return 1;

        return 0;
    }
}
