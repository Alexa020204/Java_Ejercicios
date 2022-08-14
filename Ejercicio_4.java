import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//Desarrollar un algoritmo que genere al azar N números entre 1 y 100. La cantidad N debe ser solicitada al usuario y los valores deben ser impresos separados por coma. Al finalizar se debe indicar cuál es el mayor y el menor número generado y el promedio de dichos números
public class Ejercicio_4 {
    public static void main(String[] args) {
        int aleatorio, n;
        int suma = 0;
        double promedio;


        Random r = new Random();
        Scanner ent = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.println("Ingrese un número entero: ");
        n = Integer.parseInt(ent.nextLine()); 

        for (int i =0; i<n; i++){
            aleatorio= (int)(r.nextDouble()* (99)+ 1);
            list.add(aleatorio);
            suma = suma + aleatorio;

        }

        promedio = suma/n;

       System.out.println("Lista de números aleatorios: " + list);
       System.out.println("Número Mayor: "+ Collections.max(list));
       System.out.println("Número Menor: "+ Collections.min(list));
       System.out.println("Promedio de Números: "+ promedio);
    }

}
