import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class largest {
  public static void main(String[] args) {
    ArrayList<Integer> numbers= new ArrayList<Integer>();

    Scanner input=new Scanner(System.in);
    System.out.print("Enter integers (enter a non-integer to stop): ");
    while (input.hasNextInt()) {
      int num = input.nextInt();
      numbers.add(num);
  }
  int max = Collections.max(numbers);
  System.out.println("The largest number from the inputs is: "+max);
  input.close();
}
}
