import java.util.ArrayList;

// Michael Zewdu March 04 2023 GC
public class InertialArray {
    
    int isInertial(int[] a){
        boolean oneOddValue = false;
        int maxValue = a[0];
        ArrayList<Integer> oddValues  = new ArrayList<>();
        ArrayList<Integer> evenValues  = new ArrayList<>();

        for (int index: a) {
            if(index % 2 != 0){
                oneOddValue = true;
                oddValues.add(index);
            } else{
                evenValues.add(index);
            }
            if(index > maxValue) maxValue = index;
        }

        if (!oneOddValue) return 0;

        if (maxValue % 2 == 0) {
            for (Integer oddIndex: oddValues) {
                for (Integer evenIndex: evenValues ) {
                    if (evenIndex > oddIndex && evenIndex != maxValue) return 0;
                }
            }
        } else {
            return 0;
        }

        return 1;


    }
}
