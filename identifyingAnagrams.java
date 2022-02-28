package Test;

import java.util.Arrays;

public class identifyingAnagrams {

  public static void main(String[] args) {

//Input

String firstString = "[Dusty]";
String secondString = "[Study]";

//Process

firstString = firstString.replace(" ","");
secondString = secondString.replace(" ","");

firstString = firstString.toUpperCase();
secondString = secondString.toUpperCase();

char first[] = firstString.toCharArray();
char second[] = secondString.toCharArray();

Arrays.sort(first);
Arrays.sort(second);

//Result

Boolean output = Arrays.equals(first,second);

if(output == true){
  System.out.println("The String " + firstString + " and " + secondString + " are an Anagram.");
}
else {
  System.out.println("The String " + firstString + " and " + secondString + " are not Anagram.");
}

  }

}
