public class Main {

    public static void main(String[] args){
        //SUMA1
        int valor1 = 5;
        int valor2 = 7;
        int valor3 = 10;

        int valor = suma(valor1, valor2, valor3);

        System.out.println("El resultado de la suma es: " + valor);

        //COCHE
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println("El coche tiene " + miCoche.puertas + " puertas.");
    }
    public static int suma (int a, int b, int c){
        int resultado = a + b + c;
        return resultado;
    }
}
