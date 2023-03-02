// Feb 25 2023
// Michael Zewdu
// Done 3 out of 48
public class IsCentered {
    int middleNumber;
    int isCentered(int[] input){

        if (input.length == 0){
            return 0;
        } else if (input.length == 1) {
            return 1;
        } else if ((input.length % 2) == 0){
            // Even array lengths should come here
            return 0;
        } else{
            // Odd array lengths should come here
            int midIndex = (int)Math.floor(input.length /2);
            middleNumber = input[midIndex];
            System.out.printf("The middle number is %d\n", middleNumber);
            for (int i = 0; i < input.length; i++) {
                if(i != midIndex){
                    if (input[i] <= middleNumber){
                        return 0;
                    }
                }
            }
            return 1;
        }



    }
}
