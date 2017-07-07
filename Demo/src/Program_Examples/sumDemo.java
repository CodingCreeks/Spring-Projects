package Program_Examples;

import java.util.Scanner;
class sumDemo{
   private static Scanner scanner;

public static void main(String args[]){
      scanner = new Scanner(System.in);
      int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the 10 elements:");
      for (int i=0; i<10; i++)
      {
    	  System.out.printf("Enter the %d number :", i+1);
    	  array[i] = scanner.nextInt();
    	  
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}
