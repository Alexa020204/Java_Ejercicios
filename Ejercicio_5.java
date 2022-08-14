import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Ejercicio_5 {
    //Desarrollar un algoritmo que llene un arreglo de 20 posiciones con números al azar entre 15 y 86. Posteriormente deberá ordenar el vector de manera descendente e imprimir el vector antes y después del pordenamiento.
    
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        Random r = new Random();
        int aleatorio;

        for (int i =1;i<=20;i++){
            aleatorio=(int)(r.nextDouble()*(71)+15);
            list.add(aleatorio);
        }
        System.out.println("*********** Arreglo Antes ***********");
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("*********** Arreglo Después ***********");
        System.out.println(list);

    }
    
}
