import java.util.Scanner;

class AddTwo {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int first,
        second,
        sum;
    
    System.out.println("Enter the first integer");
    first = scan.nextInt();
    
    System.out.println("Enter the second integer");
    second = scan.nextInt();
    
    sum = first + second;
    
    System.out.println("The sum of " + first + " and " + second + " is " + sum);
  }
}
