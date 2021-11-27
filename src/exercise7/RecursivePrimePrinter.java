package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        if (n == 0){
          return;
        }
        if (isPrime(n)){
          System.out.println(n);
        }
          printPrimes(n-1);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++){
          if (n % i == 0){
            return false;
          }
        }
        return true;
    }
}
