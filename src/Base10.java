public class Base10 {

    int convertToBase10(int [] a, int base){
        int base10Num = 0;
        if (isLegalNumber(a, base) == 1){

            for (int index = a.length - 1, j = 0; index >= 0; index--, j++) {
                base10Num += a[index] * Math.pow(base, j);
            }
        return base10Num;
        } else {
            return 0;
        }


    }
    int isLegalNumber(int[] a, int base){

        for (int num :
                a) {
            if (num >= base) return 0;
        }
        return 1;
    }
}
