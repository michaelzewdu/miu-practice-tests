public class BeanArray {
    int isBean(int[] a) {

        for (int index : a) {
            for (int index2 = 0; index2 < a.length; index2++) {
                if (index != a[index2]) {
                    if (index == 2 * a[index2] || index == (2 * a[index2]) + 1 || index == (int) a[index2] / 2) {
                        break;
                    }
                    if (index2 == a.length - 1){
                        return 0;
                    }


                }
            }
        }
        return 1;
    }
}
