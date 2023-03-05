// Feb 18 2023GC Michael Zewdu
//
public class Madhav {
    int isMadhavArray(int[] a) {

        if (a.length > 2) {
            int firstElement = a[0];
            int addingRange = 1;
            int rightSum = 0;
            for (int index = 1; index < a.length; ) {

                for (int y = addingRange + index; y >= index; y--) {
                    if (y < a.length) {
                        rightSum += a[y];

                    } else {
                        return 0;
                    }
                }
                if (firstElement != rightSum) return 0;
                rightSum = 0;

                addingRange++;
                index += addingRange;

            }

            return 1;
        } else {
            return 0;
        }
    }
}
