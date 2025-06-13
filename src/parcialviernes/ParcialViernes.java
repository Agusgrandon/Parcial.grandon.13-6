package parcialviernes;
import java.util.Scanner;


public class ParcialViernes {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.print("Ingresa una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("uno");
                case 2:
                    seguir = false;
                    break;
            }
        }
    }
    
}
