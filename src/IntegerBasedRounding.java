import java.util.ArrayList;

public class IntegerBasedRounding {
    int[] doIntegerBasedRounding(int[] a, int n) {
        int[] roundedA = new int[a.length];
        ArrayList<Integer> currentFactors = new ArrayList<Integer>();
        for (int index = 0; index < a.length; index++) {

            for (int j = 0; j < a[index] + n; j++) {
                if (j % n == 0) currentFactors.add(j);
            }

            if (currentFactors.size() > 1) {

                if (Math.abs(currentFactors.get(currentFactors.size() - 1) - a[index]) < Math.abs(currentFactors.get(currentFactors.size() - 2) - a[index])) {
                    roundedA[index] = currentFactors.get(currentFactors.size() - 1);
                } else if (Math.abs(currentFactors.get(currentFactors.size() - 1) - a[index]) == Math.abs(currentFactors.get(currentFactors.size() - 2) - a[index])) {
                    roundedA[index] = currentFactors.get(currentFactors.size() - 1);
                } else {
                    roundedA[index] = currentFactors.get(currentFactors.size() - 2);
                }
            } else {
                assert currentFactors.size() > 0;
                roundedA[index] = currentFactors.get(0);
            }

            currentFactors.clear();
        }
        return roundedA;
    }
}
