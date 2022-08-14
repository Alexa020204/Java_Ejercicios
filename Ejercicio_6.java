import java.util.Arrays;
import java.util.Random;

public class Ejercicio_6 {
    //Desarrollar un algoritmo que llene dos arreglos A y B de 10 posiciones con números al azar entre 200 y 1000. Posteriormente imprimir cada uno de los vectores y reemplazar los valores de A únicamente con los números pares encontrados en B y reemplazar en B únicamente con los números impares encontrados en A.

    public static void main(String[] args) {
        int A[]= new int[10];
        int B[] = new int[10];
        int a[] = new int[10];
        int b[] = new int[10];

        

        Random r = new Random();
        int aleatorio;

        for (int i =0; i<10; i++){
            aleatorio=(int)(r.nextDouble()*(800)+200);
            A[i]=aleatorio;
            aleatorio=(int)(r.nextDouble()*(800)+200);
            B[i]=aleatorio;
        }

        System.out.println("El vector A es:\n" + Arrays.toString(A));
        System.out.println("\nEl vector B es:\n" + Arrays.toString(B));

        a = Arrays.stream(B).filter(x -> x % 2 == 0).toArray();
        b = Arrays.stream(A).filter(x -> x % 2 !=0).toArray();

        System.out.println("\nEl nuevo vector A es:\n" + Arrays.toString(a));
        System.out.println("\nEl nuevo vector B es:\n" + Arrays.toString(b));


    }

}
