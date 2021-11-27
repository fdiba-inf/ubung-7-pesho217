package exercise7;

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        
        int number = input.nextInt();
        int numberOccurrences = countNumberOccurrences(number,  numbers);

        
        System.out.println("Number occurrences: " + numberOccurrences);
    }

    public static int countNumberOccurrences(int number, int[] array) {
      int counter = 0;
        for(int i = 0; i < array.length; i++){
          if (array[i] == number) {
            counter++;
          }
        }
        return counter;
    }
}
