import java.util.Scanner;
class InputSum{
   public static void main(final String args[]) {
      final Scanner scanner = new Scanner(System.in);
      final int[] array = new int[5];
      int sum = 0;
      System.out.println("\n============================================\nEnter the 5 elements:");
      for (int i = 0; i < 5; i++) {
         array[i] = scanner.nextInt();
      }
      for (final int num : array) {
          sum = sum+num;
      }
      scanner.close();
      System.out.println("\n============================================\nSum of array elements is: "+sum);
   }
}