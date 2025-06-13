package parcialviernes;
import java.util.Scanner;


public class ParcialViernes {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.println("1. Registra un viaje");
            System.out.println("2. Mostrar los viajes");
            System.out.println("3. Ordenar los viajes por costo");
            System.out.println("4. Ordenar los viajes por nombre del usuario");
            System.out.println("Mostrar el total recaudado");
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
