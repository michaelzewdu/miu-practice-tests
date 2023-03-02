import java.util.Arrays;

public class TwoArraysIntersection {

    int[] f(int[] first, int[] second ){

        if (first == null || second == null){
            return null;
        }
        if (first.length == 0 || second.length == 0){
            return new int[]{};
        }
        int intersectionIndex = 0;

        if (first.length > second.length){
            intersectionIndex = first.length;
        } else {
            intersectionIndex = second.length;
        }

        int[] intersectionArray = new int[intersectionIndex];
        int index = 0;
        for (int firstIndex:first) {
            for (int secondIndex: second) {
                if (secondIndex == firstIndex){
                    intersectionArray[index] = secondIndex;
                    index++;
                }
            }
        }
        System.out.println(Arrays.toString(intersectionArray));
        return intersectionArray;
    }
}
