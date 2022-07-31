import java.util.Scanner;

public class Ejercicio_2 {
    //. Leer una cantidad variable conocida de números e indicar finalmente cual fue el mayor número leído y cuantas veces fue ingresado

    public static void main(String[] args) {
        
        int cant,  mayor=0, cantMayor=0;
        Scanner entrada= new Scanner(System.in);

        System.out.println("Digite la cantidad de números que desea ingresar: ");
        cant= entrada.nextInt();

        int numeros[]= new int[cant];

        for (int i = 0;i<cant;i++){
            System.out.println("Ingrese un número: ");
            numeros[i]= entrada.nextInt();
            if (numeros[i]>mayor){
                mayor= numeros[i];
            }
        }

        for (int i = 0; i <cant;i++){
            if(numeros[i]==mayor){
                cantMayor++;

            }
        }
        
        System.out.println("El número mayor que se encuentra en el arreglo es : "+mayor+" y aparece " + cantMayor + " veces");

    }

}
