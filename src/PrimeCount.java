// Feb 18 2023GC Michael Zewdu
// Range prime counter
// 1 out of 48 done
public class PrimeCount {
    int primeCount(int start, int end){
        int primeCounter = 0;
        if (end < 2 || start>end){
            return 0;
        }
        for (int index = start; index<=end; index++){
            for (int y = 2; y <= index; y++) {
                if (y == index){
                    primeCounter++;
                }

               if(index % y == 0){
                   break;
               }

            }

        }
        return primeCounter;
    }
}
