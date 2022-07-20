package Coche;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        miCoche.AgregarPuerta();
        miCoche.imprimirPuerta();
	}

}

class Coche {
	public int puerta = 4;
	
	public void AgregarPuerta() {
		this.puerta++;
	}
	public void imprimirPuerta() {
		System.out.println("El coche tiene   " + puerta + " " + "puertas");
	}
}