package parcialviernes;


public class Viaje implements Comparable<Viaje>{
    private Persona pasajero;
    private VehiculoTransporte vehiculo;
    private Pasaje pasaje;

    public Viaje(Persona pasajero, VehiculoTransporte vehiculo, Pasaje pasaje) {
        this.pasajero = pasajero;
        this.vehiculo = vehiculo;
        this.pasaje = pasaje;
    }
    
    public double getCosto(){
     return pasaje.calcularCostoFinal(vehiculo.CalcularCostobase());
    }
    
    public Persona getPasajero(){
        return pasajero;
    }

    @Override
    public String toString() {
        return "Viaje{" + "pasajero=" + pasajero + ", vehiculo=" + vehiculo + ", pasaje=" + pasaje + '}';
    }
    
    @Override
    public int compareTo(Viaje viaje){
        return Double.compare(this.getCosto(), viaje.getCosto());
    }
     
}
