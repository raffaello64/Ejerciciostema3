package Sumaejercicios;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int valor1 = 15;
        int valor2 = 30;
        int valor3 = 25;
        
        var valor = suma(valor1, valor2, valor3);
        
        System.out.println(valor);
	}
    public static int suma(int a, int b, int c) {
    	return a + b + c;
    }
}
