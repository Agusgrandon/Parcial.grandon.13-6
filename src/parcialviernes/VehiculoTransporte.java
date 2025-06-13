
package parcialviernes;

public abstract class VehiculoTransporte {
    private String empresa;
    private int capacidad;
    private String patente;

    public VehiculoTransporte(String empresa, int capacidad, String patente) {
        this.empresa = empresa;
        this.capacidad = capacidad;
        this.patente = patente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0){
            System.out.println("El valor debe ser diferente a 0");
        } else {
         this.capacidad = capacidad;
        }  
    } 
    //metodo abstracto
    public abstract double CalcularCostobase();

    @Override
    public String toString() {
        return "VehiculoTransporte{" + "empresa=" + empresa + ", capacidad=" + capacidad + ", patente=" + patente + '}';
    }
    
}

    

