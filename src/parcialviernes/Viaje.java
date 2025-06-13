package parcialviernes;


public class Viaje {
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
        
}
