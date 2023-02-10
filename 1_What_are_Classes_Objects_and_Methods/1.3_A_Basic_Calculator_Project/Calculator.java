class Calculator {
  public Calculator() {
    
  }
    // Simple arithmetic calculator.
  public int add(int a, int b) {
    int sum;
    sum = a + b;
    return sum;
  }
  
  public int subtract(int c, int d) {
    int diff;
    diff = c - d;
    return diff;
  }
  
  public int multiply(int e, int f) {
    int prod;
    prod = e * f;
    return prod;
  }
  
  public int divide(int g, int h) {
    int resu;
    if(h == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }
    else {
      resu = g / h;
    }
    return resu;
  }
  
  public int modulo(int i, int j) {
    int modu;
    if(j == 0) {
      System.out.println("Error! Dividing by zero is not allowed.");
      return 0;
    }
    else {
      modu = i % j;
      return modu;
    }
  }
  
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}
