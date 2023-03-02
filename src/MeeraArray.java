public class MeeraArray {
     int isMeera(int[] a){
          if (a.length < 2){
               return 0;
          }
          boolean containsOne = false;
          boolean containsNine = false;

          for (int index: a){
               if (index == 1) containsOne = true;
               if (index == 9) containsNine = true;
          }

          if (containsOne == true && containsNine == false) {
               return 0;
          } else if (containsOne == false && containsNine == true) {
               return 0;
          } else {
               return 1;
          }

     }
}
