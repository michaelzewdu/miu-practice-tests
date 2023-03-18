public class EvenSpaced {
    int isEvenSpaced(int[] a){
        int maxNum = a[0];
        int minNum = a[0];

        for(int num : a){
            if(num > maxNum) maxNum = num;
            if(num < minNum) minNum = num;
        }
        int difference = maxNum - minNum;

        if( difference % 2 == 0) return 1;
        return 0;
    }
}
