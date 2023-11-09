import java.util.Scanner;

public class reverse{
  public static void  main(String[] args) {
    Scanner in=new Scanner(System.in);
    String word,reverse="";
    System.out.print("Enter a word: ");
    word=in.next();

    for(int i=0 ; i<word.length() ; i++){
      reverse=word.charAt(i) + reverse;
    }

    System.out.println("You entered: " + word + ", its reverse is " + reverse);

    in.close();
  }
}
