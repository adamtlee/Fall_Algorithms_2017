import java.util.*;
import java.util.Scanner;

public class Proj1 {
  public static void main (String []args){
    System.out.println("enter n: ");
    int n = new Scanner(System.in).nextInt();
    System.out.println("You printed n: " + n);
    fibonacci(int n);
    System.out.println("Fibonacci of n: " + n);
  } // End Main

  public int fibonacci(int n){
    if(n == 0)
      return 0;
    else if(n == 1)
      return 1;
    else
      return fibonacci(n - 1) + fibonacci(n - 2);
  }
} // End Class
