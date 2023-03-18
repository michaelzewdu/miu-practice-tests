public class RepsEqual {

    int repsEqual(int[] a, int n) {
        int leadingZeroCount = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index] == 0) {
                leadingZeroCount++;
            } else {
                break;
            }

        }
        System.out.println(leadingZeroCount);
        String num = Integer.toString(n);
        for (int index = leadingZeroCount, y = 0; index < a.length; index++, y++) {
            if (a[index] != Integer.parseInt(String.valueOf(num.charAt(y)))) return 0;
        }
        return 1;


    }
}
