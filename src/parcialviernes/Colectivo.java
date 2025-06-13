package parcialviernes;


public class Colectivo extends VehiculoTransporte{

    public Colectivo(String empresa, int capacidad, String patente) {
        super(empresa, capacidad, patente);
    }
    
    @Override
    public double CalcularCostobase(){
     return 500;
    }
}
