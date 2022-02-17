import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        while(counter>=1 && counter<=10){
            System.out.println("Enter number #"+counter+":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number.");
            }
            scanner.nextLine();  // handle end of line (enter key)
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
