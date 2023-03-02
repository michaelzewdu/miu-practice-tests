// 4 out of 48 done
public class POE {
    int f(int[] a ){
        if (a.length < 3){
            return -1;
        }
         int leftSum = 0;
         int rightSum = 0;
         int leftIndex = 0;
         int rightIndex = a.length - 1;
         int len = a.length -1 ;

         while(len> 0){
             if (leftSum <= rightSum){
                 leftSum+= a[leftIndex];
                 leftIndex++;
                 len--;
                 System.out.printf("Current left sum: %d\n",leftSum);
             } else if(leftSum > rightSum){
                 rightSum += a[rightIndex];
                 rightIndex--;
                 len--;
                 System.out.printf("Current right sum: %d\n",rightSum);

             }
         }
        System.out.println("End of loop");
        System.out.printf("Len value is: %d\n", len);
        System.out.printf("Left index is: %d\n", leftIndex);
        System.out.printf("Right index is: %d\n", rightIndex);
        System.out.println("==========================");
        if (leftSum == rightSum &&  leftIndex == rightIndex ){
                 return leftIndex;
        } else {
            return -1;
        }

    }
}
