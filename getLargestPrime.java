public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number>0 && number != 1){
            int i;
            for (i=2; i<number; i++){
                if (number%i == 0){
                    number /= i;
                    i--;
                }
            }
            return i;
        }
        return -1;
    }
}

//Testing:
        System.out.println(LargestPrime.getLargestPrime(21)); //7
        System.out.println(LargestPrime.getLargestPrime(217)); //31
        System.out.println(LargestPrime.getLargestPrime(0)); //-1
        System.out.println(LargestPrime.getLargestPrime(45)); //5
        System.out.println(LargestPrime.getLargestPrime(-1)); //-1
