package parcialviernes;

public class Subte extends VehiculoTransporte{

    public Subte(String empresa, int capacidad, String patente) {
        super(empresa, capacidad, patente);
    }
    
    @Override
    public double CalcularCostobase(){
     return 700;
    }
    
    @Override
    public String toString() {
        return "costo= " + CalcularCostobase();
    }
}
