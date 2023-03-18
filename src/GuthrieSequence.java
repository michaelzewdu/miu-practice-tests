public class GuthrieSequence {

    int isGuthrieSequence(int[] a){
        if (a[a.length - 1] != 1) return 0;
        for (int index = 0; index <= a.length-2; index++) {
            if(a[index] % 2 == 0){
                if(a[index+1] != a[index]/2) return 0;
            } else{
                if(a[index+1] != (a[index]*3) + 1) return 0;
            }
        }
        return 1;
    }
}
