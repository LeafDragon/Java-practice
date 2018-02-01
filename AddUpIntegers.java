import java.util.Scanner;

class AddUpIntegers {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int sumAll = 0;
    int sumEven = 0;
    int sumOdd = 0;
    int limit;
    int count = 0;
    
    System.out.println("Enter the limit:");
    limit = scan.nextInt();
    
    while (count <= limit) {
      sumAll += count;
      
      if (count % 2 == 0) {
        sumEven += count;
      } else {
        sumOdd += count;
      }
      
      count++;
    }
    
    System.out.println("Sum all: " + sumAll);
    System.out.println("Sum even: " + sumEven);
    System.out.println("Sum odd: " + sumOdd);
  }
}
