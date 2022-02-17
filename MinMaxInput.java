// -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
// -Before the user enters the number, print the message Enter number:
// -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int number = scanner.nextInt();

                if(first){
                    first = false;
                    minNumber = number;
                    maxNumber = number;
                }

                if(number>maxNumber){
                    maxNumber = number;
                } else if(number<minNumber){
                    minNumber = number;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max is: "+maxNumber);
        System.out.println("Min is: "+minNumber);

        scanner.close();

    }
}
