public class FancyNumber {

    int isFancy(int num){
        if(num < 1) return 0;
        if (num == 1) return 1;

        int prevFancyNum = 1;
        int twicePrevFancyNum = 1;
        int fancyNum = 1;
        while (num > fancyNum){

            fancyNum = (3*prevFancyNum) + (2*twicePrevFancyNum);
            twicePrevFancyNum =prevFancyNum;
            prevFancyNum =fancyNum;
            System.out.println(fancyNum);
            if (num == fancyNum) return 1;
        }
        return 0;
    }
}
