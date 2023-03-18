public class DecodeArray {

    int decodeArray(int[] a){

        String adjacentSumString = "";
        boolean isFirstNumNegative = a[0] < 0;
        Integer decodedNum;
        for (int index = 0; index < a.length-1; index++) {
            adjacentSumString = adjacentSumString.concat(String.valueOf(Math.abs(a[index] - a[index+1])));
        }
        decodedNum = Integer.parseInt(adjacentSumString);

        if (decodedNum < 0) return decodedNum;
        if (decodedNum > 0 && isFirstNumNegative) return decodedNum * -1;
        return decodedNum;
    }



}
