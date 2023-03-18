public class StantonMeasure {

    int stantonMeasure(int[] a) {
        int oneOccurence = 0;
        int nOccurence = 0;

        for (int num :  a) {
            if (num == 1) oneOccurence++;
        }

        for (int num :  a) {
            if (num == oneOccurence) nOccurence++;
        }

        return nOccurence;

    }
}
