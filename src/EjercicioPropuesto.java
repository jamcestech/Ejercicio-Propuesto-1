


import java.util.Scanner;

/**
 *
 * @author jose
 */
public class EjercicioPropuesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner( System.in );
        int day, month, year;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
      do {
        System.out.println("Hola, introduce un día del mes");
         while (!scanner.hasNextInt()) {
            System.out.println("Introduce un número!");
            scanner.next(); 
        }
        day = scanner.nextInt();
        
        
      } while(day > 31 || day < 1);
      
      do {
         System.out.println("Ahora, introduce un mes (en número)");
          while (!scanner.hasNextInt()) {
            System.out.println("Introduce un número!");
            scanner.next(); 
        }
        month = scanner.nextInt();
      } while (month > 12 || day > months[month-1] || month < 1);
      do {
          System.out.println("Por último, introduce un año");
         while (!scanner.hasNextInt()) {
            System.out.println("Introduce un número!");
            scanner.next(); 
        }
        year = scanner.nextInt();
      } while (year < 0);
        scanner.close();
    }
    
}
