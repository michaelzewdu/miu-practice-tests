public class SquarePair {

    int countSquarePairs(int[] a) {
        if (a.length < 2) return 0;
        int squarePairCount = 0;
        int pairSum = 0;
        for (int index : a) {
            for (int index2 : a) {
                if (index < index2 && index2>0 && index>0) {
                    pairSum = index2 + index;
                    if (Math.sqrt(pairSum) == Math.floor(Math.sqrt(pairSum))) squarePairCount++;
                    pairSum = 0;
                }
            }
        }
        return squarePairCount;
    }
}
