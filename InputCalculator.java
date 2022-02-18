import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;

        while (true){

            //System.out.println("Enter a number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
                scanner.nextLine();
            }else{
                long avg = Math.round((double) sum / (int) count);
                System.out.println("SUM = "+sum+" AVG = "+avg);
                break;
            }
        }
        scanner.close();
    }
}
