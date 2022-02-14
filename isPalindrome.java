public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int numberNew = number;
        int reverse = 0;
        int lastDigit = 0;

        while (numberNew > 0){
            lastDigit = numberNew % 10;
            reverse = reverse * 10 + lastDigit;
            numberNew /= 10;
        }
        if (number == reverse){
            return true;
        }
        return false;
    }
}
