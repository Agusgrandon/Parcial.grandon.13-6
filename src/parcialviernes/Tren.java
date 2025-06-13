package parcialviernes;


public class Tren extends VehiculoTransporte{

    public Tren(String empresa, int capacidad, String patente) {
        super(empresa, capacidad, patente);
    }
    
    @Override
    public double CalcularCostobase(){
     return 600;
    }
    
}
