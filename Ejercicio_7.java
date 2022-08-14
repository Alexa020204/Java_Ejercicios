import java.util.Arrays;
import java.util.Random;



public class Ejercicio_7 {
    //Desarrollar un algoritmo que llene un arreglo de 20 posiciones con números al azar entre 0 y 10. Posteriormente deberá mover todos los ceros que aparezcan al final del arreglo, manteniendo el orden relativo de los números que no son cero. Se deberá imprimir el arreglo antes y después del cambio.

    public static void main(String[] args) {

        System.out.println("Ejercicio 7");

        Random r = new Random();
        int[] arr = new int[20];
        int alt;
        int ceros=0;
        int cont=0;
        int aux;
      
        for ( int i=0; i<20;i++){
            alt = (int)(r.nextDouble()*(10)+0);
            arr[i]=alt;
        }

        System.out.println("Arreglo original----> "+ Arrays.toString(arr));

        for ( int pivote : arr){
            if (pivote == 0){
                ceros++;
            }
        }

       while (cont<ceros){
        for (int a = 0; a <19; a++){
            for (int j = 0; j<19; j++){
                if (arr[j]==0){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=aux;
                    
                }

            }
        }
        cont++;
       }

       System.out.println("Arreglo ordenado----> "+ Arrays.toString(arr));       
    }
}
