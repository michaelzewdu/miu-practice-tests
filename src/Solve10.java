public class Solve10 {
    int[] solve10() {
        int[] xy = new int[2];
        int tenFactorial = 10;
        int x = 0;
        int xFactorial = 10;
        int y = 0;
        int yFactorial = 10;
        for (int index = 9; index > 0; index--) {
            tenFactorial = tenFactorial * index;
        }

        for (int xCount = 9; xCount > 0; xCount--) {


            for (int xIndex = xCount; xIndex > 0; xIndex--) {
                xFactorial = xFactorial * xIndex;
            }
            for (int yCount = 9; yCount > 0; yCount--) {
                for (int yIndex = yCount; yIndex > 0; yIndex--) {
                    yFactorial = yFactorial * yIndex;
                }
                System.out.printf("x is: %d, y is: %d\n", xCount+ 1, yCount+1);
                if (yFactorial + xFactorial == tenFactorial) System.out.printf("x is: %d and y is: %d", xCount+1, yCount+1);
                yFactorial = yCount;
            }
            xFactorial = xCount;

        }


//        System.out.println(tenFactorial);
        return null;

    }
}
