public class ReverseInteger {
    int f(int n){
        String nToString = Integer.toString(n);
        String reversed = "";
        int index = 0;
        int finalInteger;
        int j=nToString.length() - 1 ;
        if (n<0){
            reversed = "-";
            index = 1;
        }
        while (index < nToString.length() ) {
            reversed += nToString.charAt(j);
            j--;
            index++;
        }
        finalInteger = Integer.parseInt(reversed);
        System.out.println(finalInteger);
        return finalInteger;
    }

}
