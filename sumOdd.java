// write a method called isOdd with an int parameter and call it number, the method returns a boolean.
public class Main {
   public static void main(String[] args) {
    
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));
  
   }
}


public class SumOddRange {

    public static boolean isOdd(int number){
        if (number>0){

            if(number % 2 != 0){
                return true;
            }
            return false;
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        int sum=0;
        if ((end >= start) && (end >=0) && (start>=0)){
            for(int i=start; i<= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }
}
