public class Main {

  public static void main(String[] args) {
    long startTime = System.nanoTime();
    int decimal = 173; 
    String cal = "";
    while (decimal > 0) {
      int residuo = decimal % 2;
      cal= String.valueOf(residuo)+cal;
      decimal=decimal/2;
    }
    long endTime = System.nanoTime();

    System.out.println("Su binario es: "+ cal);
    System.out.println("Tiempo de ejecución: " + (endTime-startTime)/1e6 + "ms");
  }
  
}