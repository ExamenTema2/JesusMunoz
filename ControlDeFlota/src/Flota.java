import java.util.ArrayList;

public class Flota {
	ArrayList<Vehiculo> vehiculos;

	public Flota() {
		vehiculos = new ArrayList<>();
	}

	public void add(Vehiculo vehiculo){
		vehiculos.add(vehiculo);
	}
}
