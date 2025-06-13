package parcialviernes;
import java.util.Scanner;


public class ParcialViernes {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ListaViajes listado = new ListaViajes(input);
        
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("Menu");
            System.out.println("1. Registra un viaje");
            System.out.println("2. Mostrar los viajes");
            System.out.println("3. Ordenar los viajes por costo");
            System.out.println("4. Ordenar los viajes por nombre del pasajero");
            System.out.println("5. Mostrar el total recaudado");
            System.out.println("6. Salir");
            System.out.print("Ingresa una opcion: ");
            opcion = input.nextInt();
            
            switch(opcion){
                case 1:
                    listado.agregarDatos();
                    break;
                case 2:
                    listado.mostrarDatos();
                    break;
                case 3:
                    listado.ordenarPorCosto();
                    break;
                case 4:
                    listado.ordenarPorNombre();
                    break;
                case 5:
                    System.out.println("El total recaudado es: " + listado.totalRecaudado());
                    break;
                case 6:
                    seguir = false;
                    break;
            }
        }
    }
    
}
