package Test;

import java.util.HashMap;



public class firstNonRepeatedCharacter {

  public static void main(String[] args) {

String word = "Mississippi";
int measure = word.length();

HashMap<Character,Integer> characterCount = new HashMap<Character,Integer>();

Character ch;

for(int i = 0; i < measure; i++){
  ch = word.charAt(i);
  
  if(characterCount.containsKey(ch)){
    characterCount.put(ch, characterCount.get(ch) + 1);  
  }
  else {
    characterCount.put(ch, 1);
  }
}
for(int a = 0; a < measure; a++){
  ch = word.charAt(a);
  
  if(characterCount.get(ch)==1){
    System.out.println("The first non-repeated \ncharacter from the string is: " + ch);
    break;
  }
}
  }

}
