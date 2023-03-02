public class SumOfTwoSquares {

    int answerOne(int n){
        int counter = 0;
        double currentNo;
        int index2 = n-1;
        for (int index = 1; index < n-1 ; index++) {
            System.out.printf("Index: %d J: %d\n", index, index2);
            if( Math.floor(Math.sqrt(index)) == Math.sqrt(index)  && Math.floor(Math.sqrt(index2)) == Math.sqrt(index2) ) counter++;
            index2--;
//            System.out.println(counter);
            if(counter == 2) return 2;

            if (index == index2) return counter;
        }
        return 0;
    }
}
