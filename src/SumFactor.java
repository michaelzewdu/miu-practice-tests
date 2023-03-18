public class SumFactor {

    int sumFactor(int[] a){
        int arraySum = 0;
        int occurence = 0;
        for (int num : a) {
            arraySum += num;
        }

        for (int num :
                a) {
            if (num == arraySum) occurence++;
        }

        return occurence;

    }
}
