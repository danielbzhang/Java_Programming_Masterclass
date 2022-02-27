import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = readInteger();
        int[] returnedArray = readElements(count);
        int arrayMin = findMin(returnedArray);
        System.out.println("min = "+arrayMin);
    }

    public static int readInteger(){
        System.out.println("Enter count: ");
        int count =  scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count){
        int[] array = new int[count];
        for (int i=0; i< array.length; i++){
            System.out.println("Enter a number: ");
            array[i] = (int) scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
