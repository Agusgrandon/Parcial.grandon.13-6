package parcialviernes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaViajes {
    private List<Viaje> listaDeViajes;
    private Scanner input;

    public ListaViajes(Scanner input) {
        this.listaDeViajes = new ArrayList();
        this.input = input;
    }
    
    public void agregarDatos(){
        System.out.print("Ingresa el nombre del pasajero");
        String nombre = input.nextLine();
        Persona persona = new Persona(nombre);
        input.nextLine(); //limpie salto de linea
        
        System.out.println("Ingresa el tipo de transporte");
        System.out.println("1. Colectivo");
        System.out.println("2. Tren");
        System.out.println("3. Subte");
        System.out.print("Ingresa la opcion: ");
        int opcion1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Ingresa la patente: ");
        String patente = input.nextLine();
        System.out.print("Ingresa la capacidad: ");
        int capacidad = input.nextInt();
        System.out.print("Ingresa la empresa: ");
        String empresa = input.nextLine();
        input.nextLine();
        
        VehiculoTransporte vehiculo = null;
        
        switch(opcion1){
            case 1: 
                vehiculo = new Colectivo(patente, capacidad, empresa);
                break;
            case 2:
                vehiculo = new Tren(patente, capacidad, empresa);
                break;
            case 3:
                vehiculo = new Subte(patente, capacidad, empresa);
                break;
        }
        
        System.out.println("Ingresa el tipo de pasaje");
        System.out.println("1. Pasaje comun");
        System.out.println("2. Pasaje estudiante");
        System.out.println("3. Pasaje jubilado");
        System.out.print("Ingresa una opcion: ");
    }
    
}
