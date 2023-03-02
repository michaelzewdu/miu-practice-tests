public class NextPerfectSquare {

    int isPerfectSquare(int n){
        if (n < 0){
            return 0;
        }

        int wholeNumber = 0;
        int perfectSquare = 0;

        while (perfectSquare <= n){
            perfectSquare = wholeNumber * wholeNumber;
            if (perfectSquare > n){
                return perfectSquare;
            }
            wholeNumber++;
        }

        return 0;



    }
}
