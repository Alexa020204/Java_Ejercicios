import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//Construya una tabla de seguimiento con no menos de 15 bultos para realizar la prueba del algoritmo.

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int peso, valor_bulto;
        int i = 0;
        double promedio=0;
        ArrayList<Integer> bulto = new ArrayList<Integer>();
        ArrayList<Integer> pesos = new ArrayList<Integer>();
        ArrayList<Integer> dolares = new ArrayList<Integer>();

        while(i<15){
            System.out.println("Ingrese el peso del bulto: ");
            peso = Integer.parseInt(ent.nextLine());
            i++;

            if(peso<=500){
                promedio = peso + promedio;
                bulto.add(peso);
                if (peso <= 25){
                    valor_bulto=0;
                }
                else if (26<=peso){
                    valor_bulto= 1500*peso;
                    pesos.add(valor_bulto);
                    dolares.add(valor_bulto*4000);
                }
                else{
                    valor_bulto=2500*peso;
                    pesos.add(valor_bulto);
                    dolares.add(valor_bulto*4000);
                }
            }
            else{
                System.out.println("El peso del bulto no es permitido");
                i=i-1;
            }
        }
        System.out.println("******************************************* \n Tabla de Seguimiento" );
        System.out.println("Número de bulto:          | "+ 15);
        System.out.println("Bulto más pesado:         | "+ Collections.max(bulto) + " Kg");
        System.out.println("Bulto menos pesado:       | "+ Collections.min(bulto) + " Kg");
        System.out.println("Peso promedio bultos:     | "+ promedio/15 + "Kg");
        System.out.println("Ganancia total:           | "+ pesos.stream().mapToInt(Integer::intValue).sum() + " COP");
        System.out.println("Ganancia total dolares:   | "+ dolares.stream().mapToInt(Integer::intValue).sum() + " $");


    }
}

