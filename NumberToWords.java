public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);

        for(int i = 0; i < digitCount; i++) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:break;
                }
                reversedNumber /= 10;
            }
        }

    public static int reverse(int number){
        int reversedNumber = 0;
        if (number > 0){
            while (number > 0){
                int lastDigit = number % 10;
                reversedNumber = reversedNumber * 10 + lastDigit;
                number /= 10;
            }
            return reversedNumber;
        } else {
            return (-1 * reverse(Math.abs(number)));
        }
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
//        int count = 1;
//        while (number > 0){
//            count ++;
//            number /= 10;
//        }
//        return count;
        
// Or equavalently using a "do{}while()"
        int count = 0;
        do{
            count ++;
            number /= 10;
        } while (number > 0);
        return count;
    }
}
