package Test;


public class removingWhiteSpaces {

  public static void main(String[] args) {


String example = "Hello Welcome to Java";
System.out.println("Before removing whitespaces:\n" + example);

example = example.replaceAll(" ","");

System.out.println("\nAfter removing white spaces:\n" + example);
  
  }

}
