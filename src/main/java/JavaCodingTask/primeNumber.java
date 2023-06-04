package JavaCodingTask;

public class primeNumber {

    public static void main(String[] args) {

       int primeNumber = 13;

        System.out.println(primeNumber(primeNumber));



    }


    public static boolean primeNumber(int number){

        boolean primeNumber = false;

        if(number < 2){
            return primeNumber;
        }

        for (int i = 2; i <= number ; i++) {

            if(number%2!=0){
                primeNumber =true;
            }
        }

        return primeNumber;
    }
}
