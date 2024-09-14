package ContainsTheCharacter;

import java.util.Scanner;

public class ContainsTheCharacter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String[] stringInput = input.split(" ");

      int NUM_ELEMENTS = Integer.parseInt(stringInput[0]);
      char charInput = stringInput[stringInput.length - 1].charAt(0);

      System.out.println(NUM_ELEMENTS);
      System.out.println(charInput);

      String[] newStringArray = new String[NUM_ELEMENTS];

      for(int i = 0; i < NUM_ELEMENTS; ++i){
        newStringArray[i] = stringInput[i + 1];
        System.out.println(newStringArray[i]);
      }

   }
}
