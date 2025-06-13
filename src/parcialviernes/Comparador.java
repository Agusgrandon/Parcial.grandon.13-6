package parcialviernes;
import java.util.Comparator;


public class Comparador {
    public static final Comparador<Viaje> porNombre =
            (n1, n2) -> n1.getPasajero().getNombre().compareToIgnoreCase(n2.getPasajero().getNombre());
}
