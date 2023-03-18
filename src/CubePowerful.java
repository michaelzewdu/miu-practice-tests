// March 18 2023 Also the night before the test
import java.util.ArrayList;

public class CubePowerful {

    int isCubePowerful(int n){
        if (n < 1) return 0;
        int cubeSum = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        int checkNum = n;
        while(n > 9) {
            digits.add(n % 10);
            n = Math.floorDiv(n, 10);
            if (n < 10) digits.add(n);
        }
        for (int num: digits) {
            cubeSum += Math.pow(num, 3);
        }
        if (cubeSum == checkNum) return 1;
        return 0;

    }
}
