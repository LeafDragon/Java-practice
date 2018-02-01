class AverageArray {
  public static void main(String[] args) {
    double[] array = {-47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42};
    
    if (array.length > 0) {
      double total = 0.0;
      
      for (double x : array) {
        total += x;
      }
      
      System.out.println("The total is: " + total);
      System.out.println("The average is: " + (total / array.length) );
      
    } else {
      System.out.println("The array contains no elements.");
    }
  }
}
