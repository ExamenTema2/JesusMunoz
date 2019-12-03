public class Vehiculo {
	private String matricula;
	private String fabricante;
	private String modelo;

	public Vehiculo(String matricula, String fabricante, String modelo) {
		this.matricula = matricula;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}

//Autor: Mario Mu�oz Serrano.
//Descripci�n: veh�culo perteneciente a una flota de veh�culos.
//Realizo otro cambio por haber hecho merge por error.