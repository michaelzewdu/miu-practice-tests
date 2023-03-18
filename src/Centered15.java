public class Centered15 {

    int isCentered15(int[] a) {

        if (a.length < 3) return 0;
        int sum = 0;
        for (int edgeCount = 1; edgeCount < a.length - 1; edgeCount++) {

            for (int index = edgeCount; index < a.length - edgeCount; index++) {
                sum += a[index];
            }
            if (sum == 15) return 1;
            sum = 0;

        }
        return 0;
    }
}
