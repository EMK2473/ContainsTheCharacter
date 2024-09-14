package ContainsTheCharacter;

import java.util.Scanner;

public class ContainsTheCharacter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String input = scnr.nextLine();
      String[] stringInput = input.split(" ");

      int NUM_ELEMENTS = Integer.parseInt(stringInput[0]);
      char charInput = stringInput[stringInput.length - 1].charAt(0);

      String[] newStringArray = new String[NUM_ELEMENTS];

      for(int i = 0; i < NUM_ELEMENTS; ++i){
        newStringArray[i] = stringInput[i + 1];
      }

      for(String s: newStringArray){
        if(s.indexOf(charInput) >= 0){
            System.out.print(s + ",");
        }
      }
      System.out.println();
      scnr.close();
   }
}
