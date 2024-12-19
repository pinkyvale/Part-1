package runquad;
import java.util.Scanner;

public class RunQuad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        
        while(shape == null) {
            System.out.print("Press R for Rectangle and S for Square: ");
            String input = scanner.next();
            
            if (input.length() != 1) {
                System.out.println("Invalid input. Please enter a single character (R or S only).");
                continue;
            }
            
            char choice = Character.toUpperCase(input.charAt(0));
            
            switch(choice) {
                case 'R':
                    shape = new Rectangle();
                    break;
                case 'S':
                    shape = new Square();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        shape.showDescription();
        scanner.close(); 
    }
    
}