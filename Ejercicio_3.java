
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio_3 {
    
    //Desarrolle un algoritmo que imprima los primeros N números primos. La cantidad N debe ser solicitada al usuario y los valores deben ser impresos separados por coma.

    public static void main(String[] args) {
        int cant, cont=0, inicio=2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de números primos que quiera imprimir: ");
        cant= entrada.nextInt();
        int primos[]=new int[cant];

        while(cont<cant){
            if(primos(inicio)){
                primos[cont]=inicio;
                cont++;
            }
            inicio++;
        }
        System.out.println(Arrays.toString(primos));

    }
    public static boolean primos(int num){
        for(int i =2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
