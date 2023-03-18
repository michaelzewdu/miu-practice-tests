// March 15 2023 Three days before the test

public class Nunique {
    int isNUnique(int[] a, int n) {

        int equivalentPairSumFound = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (i != j && a[i] + a[j] == n) {
                    equivalentPairSumFound++;
                }
            }
        }
            if (equivalentPairSumFound == 1) return 1;
            return 0;
    }
}
