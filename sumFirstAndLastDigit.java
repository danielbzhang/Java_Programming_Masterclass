public class firstAndlastDigitSum {

    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number % 10;
        while(number >= 10){
            number = number / 10;
        }
        int firstDigit = number;
        int sum = lastDigit + firstDigit;
        if (sum >= 0){
            return sum;
        }
        return -1;
    }
}
