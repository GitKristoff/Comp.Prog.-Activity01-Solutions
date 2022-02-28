package Test;

public class countingDuplicateCharacters {

  public static void main(String[] args) {
 
//input 

String input = "Mississippi";

String characters = "";
String duplicates = "";

//process

for(int i = 0; i < input.length(); i++) {
String current = Character.toString(input.charAt(i));

if(characters.contains(current)){
  if(!duplicates.contains(current)){
    duplicates += current + ",";
  }
}
characters += current;

}
//result

System.out.println("There are: " + duplicates.length() + " duplicate characters.");
System.out.println("The duplicate characters are " + "[" + duplicates + "]");

  }

}
