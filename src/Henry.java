// Michael Zewdu March 14 2023

import java.util.ArrayList;

public class Henry {

    int henry(int i, int j) {
        int henriesFound = 0;
        int henriesSum = 0;
        ArrayList<Integer> henryList = new ArrayList<>();

        for (int index = 0; henriesFound <= j; index++) {
            int factorSum = 0;
            ArrayList<Integer> factors = new ArrayList<>();
            for (int k = 1; k < index; k++) {
                if (index % k == 0) factors.add(k);
            }

            for (int factor : factors) {
                factorSum += factor;
            }

            if (factorSum == index) {
                henryList.add(index);
                henriesFound++;
            }
            factors.clear();
        }

        henriesSum = henryList.get(i) + henryList.get(j);

        return henriesSum;
    }
}
