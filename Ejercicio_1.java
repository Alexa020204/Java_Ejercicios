import java.util.Scanner;

public class Ejercicio_1{
    //Leer una cantidad variable de números e indicar cuanto suman todos los números, cuanto los números positivos y cuantos los numeros negativos

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int cant, num, suma=0, sumPositivo=0, sumNegativo=0;

        System.out.println("*************** Primer ejercicio ****************");
        System.out.println("Ingrese la cantidad de números que quiera sumar: ");
        cant= entrada.nextInt();

        for(int i = 1; i<=cant;i++){
            System.out.println("\nIngrese un número: ");
            num=entrada.nextInt();
            suma=suma+num;

            if(num>=0){
                sumPositivo=sumPositivo+num;
            }
            else{
                sumNegativo=sumNegativo+num;
            }

        }
        System.out.println("\n La suma de todos los números es: "+suma+"\n La suma de los números positivos es: "+sumPositivo+" \n La suma de los números negativos es: "+ sumNegativo);

    }



}